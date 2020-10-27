package Demo3.wait_notify_size5;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-26 09:33
 **/

public class ThreadA extends Thread{
    private Object lock;

    public ThreadA(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                if (MyList.size() !=5) {
                    System.out.println("wait begin" +System.currentTimeMillis());
                    lock.wait();
                    System.out.println("wait end" +System.currentTimeMillis());
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

