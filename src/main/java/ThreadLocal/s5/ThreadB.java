package ThreadLocal.s5;

import java.util.Date;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-29 11:01
 **/

public class ThreadB extends Thread{
    @Override
    public void run() {
        for (int i= 0;i<20;i++) {
            if (Tools.t1.get() == null) {
                Tools.t1.set(new Date());
            }
            System.out.println("B"+Tools.t1.get().getTime());
        }
    }
}

