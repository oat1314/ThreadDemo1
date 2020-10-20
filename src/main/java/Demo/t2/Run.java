package Demo.t2;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-19 14:46
 **/

public class Run {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("运行结束!");
    }


}

