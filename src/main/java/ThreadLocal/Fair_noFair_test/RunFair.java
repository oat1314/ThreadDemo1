package ThreadLocal.Fair_noFair_test;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-29 15:09
 **/

public class RunFair {
    public static void main(String[] args) {
        final Service service = new Service(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("1线程"+Thread.currentThread().getName()+"运行了");
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

