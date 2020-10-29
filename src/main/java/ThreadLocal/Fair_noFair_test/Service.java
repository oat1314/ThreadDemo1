package ThreadLocal.Fair_noFair_test;

import io.netty.bootstrap.ServerBootstrap;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-29 15:07
 **/

public class Service {
    private ReentrantLock lock;
    public Service(boolean isFair) {
        super();
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod() {
        try {
            lock.lock();
            System.out.println("ThreadName="+Thread.currentThread().getName()+"获得锁定");
        } finally {
            lock.unlock();
        }

    }

}

