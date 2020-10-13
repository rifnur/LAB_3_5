
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Main {
    public  static void main (String[] args) {
        Semaphore semaphore = new Semaphore(3);
        FuelStaion fuelStaion = new FuelStaion(semaphore);
        ExecutorService executorService = Executors.newFixedThreadPool(10);

// не могу использовать машины с массива.
//        Car[] car = {new Car("Car 1",fuelStaion), new Car("Car 2",fuelStaion), new Car("Car 3",fuelStaion),
//                new Car("Car 4",fuelStaion)};
//        Truck[] truck = {new Truck("Truk 1",fuelStaion), new Truck("Truk 2",fuelStaion), new Truck("Truk 2",fuelStaion)};
//        Bus[] bus = {new Bus("Bus 1",fuelStaion), new Bus("Bus 3",fuelStaion), new Bus("Bus 3",fuelStaion)};
for (int i=1;i<= 3;i++){
    executorService.submit(new Car("Car "+i,fuelStaion));
}
        for (int i=1;i<= 3;i++){
            executorService.submit(new Truck("Truk "+i,fuelStaion));
        }
        for (int i=1;i<= 3;i++){
            executorService.submit(new Bus("Bus "+i,fuelStaion));
        }
        executorService.shutdown();
    }
}