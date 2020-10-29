package ThreadLocal.ConditionTest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-29 14:52
 **/

public class MyService {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean hasVaule = false;

    public void  set() {
        try {
            lock.lock();
            while (hasVaule == true) {
                System.out.println("有可能★★连续");
                condition.signal();
            }
            System.out.println("打印★");
            hasVaule = true;
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void get() {
        try {
            lock.lock();
            while (hasVaule ==false) {
                System.out.println("有可能☆☆连续");
                condition.await();
            }
            System.out.println("打印☆");
            hasVaule = false;
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }


}

