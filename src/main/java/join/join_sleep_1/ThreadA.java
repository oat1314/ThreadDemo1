package join.join_sleep_1;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-28 18:11
 **/

public class ThreadA extends Thread{
    private ThreadB b;

    public ThreadA(ThreadB b) {
        super();
        this.b = b;
    }

    @Override
    public void run() {
        try {
            synchronized (b) {
                b.start();
                Thread.sleep(6000);
                //Thread.sleep()
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

