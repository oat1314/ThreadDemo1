package SafeDemo.t2;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-21 11:49
 **/

public class Run {
    public static void main(String[] args) {
        HaselfPrivateNum numRef = new HaselfPrivateNum();
        ThreadA athread = new ThreadA(numRef);
        athread.start();
        ThreadB bthread = new ThreadB(numRef);
        bthread.start();
    }


}

