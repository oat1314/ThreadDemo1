package ThreadLocal.s5;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-29 11:04
 **/

public class Run {
    public static void main(String[] args) {
        try {
            ThreadA a = new ThreadA();
            a.start();
            Thread.sleep(1000);
            ThreadB b = new ThreadB();
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}

