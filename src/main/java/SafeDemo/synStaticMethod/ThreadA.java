package SafeDemo.synStaticMethod;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-23 10:13
 **/

public class ThreadA extends Thread{
    @Override
    public void run() {
        Service.printA();
    }
}

