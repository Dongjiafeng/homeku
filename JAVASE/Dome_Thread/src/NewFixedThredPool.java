import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewFixedThredPool {
    public static void main(String[] args) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
        for (int i = 0; i <10 ; i++) {
            final  int index = i ;
            newFixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(index);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            
        }
    }
}
