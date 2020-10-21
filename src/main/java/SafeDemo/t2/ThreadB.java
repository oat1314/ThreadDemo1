package SafeDemo.t2;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-21 11:48
 **/

public class ThreadB extends Thread{
    private HaselfPrivateNum numRef;

    public ThreadB(HaselfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("b");
    }
}

