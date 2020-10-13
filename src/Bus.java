public class Bus extends CarsAll {

    public Bus(String name,FuelStaion fuelStaion) {
        super(name, 40, 7.5f,fuelStaion);
    }


    @Override
    public String toString() {
        return name ;
    }
}
