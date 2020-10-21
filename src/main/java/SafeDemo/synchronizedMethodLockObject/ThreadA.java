package SafeDemo.synchronizedMethodLockObject;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-21 14:13
 **/

public class ThreadA extends Thread{
    private MyObject object;

    public ThreadA(MyObject object) {
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodA();
    }
}

