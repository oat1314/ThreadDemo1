package join.join_sleep_1;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-28 18:18
 **/

public class Run {
    public static void main(String[] args) {
        try {
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();
            Thread.sleep(1000);
            ThreadC c = new ThreadC(b);
            c.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}

