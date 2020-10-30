package Demo123.singleton_2_2;


import Demo123.singleton_02.MyThread;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-29 17:58
 **/

public class Run {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.start();
        t2.start();
        t3.start();
    }


}

