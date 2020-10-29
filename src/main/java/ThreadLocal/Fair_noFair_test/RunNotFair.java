package ThreadLocal.Fair_noFair_test;

import java.util.concurrent.ForkJoinPool;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-29 15:13
 **/

public class RunNotFair {
    public static void main(String[] args) {
        final Service service = new Service(false);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("2线程"+Thread.currentThread().getName()+"运行了");
                service.serviceMethod();
            }
        };
        Thread[] threadArray = new Thread[10];
        for (int i =0;i<10;i++) {
            threadArray[i] = new Thread(runnable);
        }
        for (int i=0;i<10;i++) {
            threadArray[i].start();
        }
    }

}

