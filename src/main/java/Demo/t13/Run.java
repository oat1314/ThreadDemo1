package Demo.t13;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-20 17:33
 **/

public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }

}

