package Demo2.TwoThreadTransData;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-23 17:39
 **/

public class Test {
    public static void main(String[] args) {
        MyList service = new MyList();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }


}

