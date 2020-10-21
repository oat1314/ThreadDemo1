package SafeDemo.t2;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-21 11:43
 **/

public class ThreadA extends Thread{
    private HaselfPrivateNum numRef;
    public ThreadA(HaselfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("a");
    }
}

