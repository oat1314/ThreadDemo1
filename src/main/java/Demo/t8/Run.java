package Demo.t8;

import java.sql.SQLOutput;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-19 14:58
 **/

public class Run {
    public static void main(String[] args) {
        MyThread1 myThread = new MyThread1();
        System.out.println("begin ="+ System.currentTimeMillis());
        myThread.run();
        System.out.println("end ="+System.currentTimeMillis());
    }

}

