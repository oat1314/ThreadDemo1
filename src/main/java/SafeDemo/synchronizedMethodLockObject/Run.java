package SafeDemo.synchronizedMethodLockObject;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-21 14:15
 **/

public class Run {
    public static void main(String[] args) {
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(object);
        a.setName("A");
        ThreadB b = new ThreadB(object);
        b.setName("B");
        a.start();
        b.start();
    }


}

