package ThreadLocal.ThreadLoaclTest;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-29 10:14
 **/

public class ThreadB extends Thread{
    @Override
    public void run() {
        try {
            for (int i= 0;i<100;i++) {
                Tools.t1.set("ThreadB"+(i+1));
                System.out.println("ThreadB get Value="+Tools.t1.get());
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

