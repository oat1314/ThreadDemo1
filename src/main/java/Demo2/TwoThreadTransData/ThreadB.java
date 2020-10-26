package Demo2.TwoThreadTransData;

import java.util.List;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-23 17:36
 **/

public class ThreadB extends Thread{
    private MyList list;
    public ThreadB(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (list.size()==5) {
                    System.out.println("==5了,线程b要退出了!");
                    throw new InterruptedException();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

