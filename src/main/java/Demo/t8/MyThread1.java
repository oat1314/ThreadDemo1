package Demo.t8;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-19 14:56
 **/

public class MyThread1 extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("run threadName=" + currentThread().getName() + "begin");
            Thread.sleep(2000);
            System.out.println("run threadName=" + currentThread().getName() + "end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

