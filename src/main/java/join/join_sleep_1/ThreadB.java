package join.join_sleep_1;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-28 18:12
 **/

public class ThreadB extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("b run begin timer="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("b run end timer="+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    synchronized public void bService() {
        System.out.println("打印了bService timer="+System.currentTimeMillis());
    }
}

