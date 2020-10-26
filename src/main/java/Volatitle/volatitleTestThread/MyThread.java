package Volatitle.volatitleTestThread;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-23 14:05
 **/

public class MyThread extends Thread {
    volatile public static int count;
    synchronized private static void addCount(){
        for (int i=0;i < 100;i++) {
            count++;
        }
        System.out.println("count="+ count);
    }

    @Override
    public void run() {
        addCount();
    }
}

