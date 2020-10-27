package Demo3.notifyOne;

import io.netty.bootstrap.ServerBootstrap;

import java.util.concurrent.locks.Lock;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-26 09:52
 **/

public class ThreadA extends Thread{
    private Object lock;

    public ThreadA(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}

