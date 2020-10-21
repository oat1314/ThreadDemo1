package Demo.suspend_resume_test;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-20 18:19
 **/

public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(5000);
            thread.suspend();
            System.out.println("A="+System.currentTimeMillis()+"i="+thread.getI());
            Thread.sleep(5000);
            System.out.println("A="+System.currentTimeMillis()+"i="+thread.getI());

            //B
            thread.resume();
            Thread.sleep(5000);

            thread.suspend();
            System.out.println("B=" +System.currentTimeMillis()+"i="+thread.getI());
            Thread.sleep(5000);
            System.out.println("B=" +System.currentTimeMillis()+"i="+thread.getI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

