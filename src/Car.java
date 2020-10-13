public class Car  extends CarsAll {

//    public Car(String name, float capacity, float consumption) {
//        super(name, capacity, consumption);
//    }

    public Car(String name,FuelStaion fuelStaion) {
        super(name, 20, 2.5f,fuelStaion);
    }

    @Override
    public String toString() {
        return name ;
    }
}
