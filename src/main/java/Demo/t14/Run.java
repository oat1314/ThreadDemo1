package Demo.t14;

import Demo.t14.Mythread;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-20 17:50
 **/

public class Run {

    public static void main(String[] args) {
        try {
            Mythread mythread = new Mythread();
            mythread.start();
            Thread.sleep(200);
            mythread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main");
        }
    }

}

