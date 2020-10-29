package ThreadLocal.z3_ok;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-29 13:55
 **/

public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThreadA a  = new MyThreadA(myService);
        a.start();
    }


}

