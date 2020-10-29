package ThreadLocal.UserConditionWaitNotifyOk;

import Demo3.notifyOne.Service;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-29 14:18
 **/

public class ThreadA extends Thread{
    private MyService myService;

    public ThreadA(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.await();
    }
}

