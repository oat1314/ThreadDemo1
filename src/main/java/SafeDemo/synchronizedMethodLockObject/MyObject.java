package SafeDemo.synchronizedMethodLockObject;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-21 14:10
 **/

public class MyObject {
    synchronized public void methodA() {
        try {
            System.out.println("begin methodA threadName=" + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

