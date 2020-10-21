package SafeDemo.synchronizedMethodLockObject;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-21 14:14
 **/

public class ThreadB extends Thread{
    private MyObject object;

    public ThreadB(MyObject object) {
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodA();
    }
}

