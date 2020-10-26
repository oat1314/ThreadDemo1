package Volatitle.t16;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-23 13:54
 **/

public class Run {
    public static void main(String[] args) {
        try {
            RunThread thread = new RunThread();
            thread.start();
            Thread.sleep(1000);
            System.out.println("已经赋值为false");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}

