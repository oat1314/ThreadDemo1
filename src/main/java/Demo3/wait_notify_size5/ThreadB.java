package Demo3.wait_notify_size5;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-26 09:35
 **/

public class ThreadB extends Thread{
    private Object lock;

    public ThreadB(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                for (int i=0;i<10;i++) {
                    MyList.add();
                    if(MyList.size() ==5) {
                        lock.notify();
                        System.out.println("已发出通知!");
                    }
                    System.out.println("添加了"+(i+1)+"个元素!");
                    Thread.sleep(1000);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

