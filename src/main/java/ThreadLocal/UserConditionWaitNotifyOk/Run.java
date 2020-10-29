package ThreadLocal.UserConditionWaitNotifyOk;

import javax.sql.rowset.serial.SerialArray;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-29 14:19
 **/

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        ThreadA a = new ThreadA(myService);
        a.start();
        Thread.sleep(3000);
        myService.signal();
    }


}

