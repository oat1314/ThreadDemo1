package SafeDemo.synStaticMethod;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-23 10:14
 **/

public class Run {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB();
        b.setName("B");
        b.start();
    }


}

