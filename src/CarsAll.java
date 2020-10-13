public abstract class CarsAll  implements Runnable {
    protected String name;
    protected float capacity;
    protected float consumption;
    protected float size;
    protected FuelStaion fuelStaion;

    public CarsAll(String name, float capacity, float consumption, FuelStaion fuelStaion) {
        this.name = name;
        this.capacity = capacity;
        this.consumption = consumption;
        this.size=capacity;
        this.fuelStaion=fuelStaion;
    }

    public void drive() {
        try {
            while (true) {
                if (size<consumption){
                    System.out.println(
                            String.format("%s на заправке. Осталось топлива - %s",
                                    name,size)
                    );
                    size= fuelStaion.start(capacity);
                    System.out.println(
                            String.format("%s заправился",
                                    name)
                    );
                }
                System.out.println(
                        String.format("%s поехал. Осталось топлива - %s, Объем бака -  %s, расход топлива -  %s",
                                name,
                                size,
                                capacity,
                                consumption)
                );
                Thread.sleep(3000);
                size -= consumption;
            }
        } catch (Exception e) {
            throw new RuntimeException("SWW", e);
        }
    }

    @Override
    public void run() {
        drive();
    }
}