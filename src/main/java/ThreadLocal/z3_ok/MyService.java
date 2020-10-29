package ThreadLocal.z3_ok;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-29 13:48
 **/

public class MyService {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod() {
        try {
            System.out.println("A");
            lock.lock();
            condition.await();
            System.out.println("B");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println("锁释放了");
        }
    }


}

