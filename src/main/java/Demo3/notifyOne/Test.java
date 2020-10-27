package Demo3.notifyOne;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-26 09:55
 **/

public class Test {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.start();
        ThreadB b = new ThreadB(lock);
        b.start();
        ThreadC c = new ThreadC(lock);
        c.start();
        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();
    }


}

