import java.util.concurrent.Semaphore;

public class FuelStaion {

    private Semaphore semaphore;

    public FuelStaion(Semaphore semaphore) {
        this.semaphore = semaphore;
    }
    public float start (float requesvalue) {
          try {
                    semaphore.acquire();
                    return requesvalue;
                } catch (Exception  e) {
                   throw  new RuntimeException("SWW",e);
               }
            }
    }
