public class Truck extends CarsAll {
    public Truck(String name,FuelStaion fuelStaion) {
        super(name, 60, 15,fuelStaion);
    }

    @Override
    public String toString() {
        return name ;
    }
}
