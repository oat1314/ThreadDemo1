package Volatitle.volatitleTestThread;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-23 14:06
 **/

public class Run {
    public static void main(String[] args) {
        MyThread[] myThreads = new MyThread[100];
        for (int i=0;i <100;i++) {
            myThreads[i] = new MyThread();
        }
        for (int i=0;i<100;i++){
            myThreads[i].start();
        }
    }

}

