package SafeDemo.synNotExtends;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-22 10:02
 **/

public class Run {
    public static void main(String[] args) {
        Sub subRef = new Sub();
        ThreadA a = new ThreadA(subRef);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(subRef);
        b.setName("B");
        b.start();
    }


}

