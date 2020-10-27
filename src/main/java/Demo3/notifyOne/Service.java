package Demo3.notifyOne;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-26 09:50
 **/

public class Service {
    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin wait() ThreadName=" +Thread.currentThread().getName());
                lock.wait();
                System.out.println("end wati() ThreadName="+Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}

