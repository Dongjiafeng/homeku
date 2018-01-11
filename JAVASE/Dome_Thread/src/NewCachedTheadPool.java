import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewCachedTheadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        //表示一直在用一个线程,因为我们为它定了休眠
        //所以第一个线程执行循环时,先执行了0后睡眠.因为占时休眠,线程属于空闲,并不会对创建线程去执行.
        //而在用这个线程执行下一次循环时,又加上了之前的睡眠时间.变慢了.所有线程睡眠的.起步时,依旧那个线程是空闲的,复用它
        //所以不会创建新的线程;
        //当运行完时.这个线程不会立即消失.他会等你给他下达新指令,当它60秒没指令就会被线程池消灭. 为什么要等60秒.我们看看
//        源码.
        for (int i = 0; i <10; i++) {
            final   int index = i;
            try {
                Thread.sleep(index*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(index);

                }
            });


        }
    }
}
