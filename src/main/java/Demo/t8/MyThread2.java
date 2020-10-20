package Demo.t8;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-19 15:04
 **/

public class MyThread2 extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("run threadName=" + currentThread().getName() + "begin" + System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("run threadName=" + currentThread().getName() + "end" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

