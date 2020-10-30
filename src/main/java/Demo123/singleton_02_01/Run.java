package Demo123.singleton_02_01;


import Demo123.singleton_02.MyThread;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-29 17:58
 **/

public class Run {
    public static void main(String[] args) {
        Demo123.singleton_02.MyThread t1 = new Demo123.singleton_02.MyThread();
        Demo123.singleton_02.MyThread t2 = new Demo123.singleton_02.MyThread();
        Demo123.singleton_02.MyThread t3 = new MyThread();
        t1.start();
        t2.start();
        t3.start();
    }


}

