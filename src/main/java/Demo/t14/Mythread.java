package Demo.t14;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-20 17:42
 **/

public class Mythread extends Thread{
    @Override
    public void run() {
        super.run();
        try {
            System.out.println("run begin");
            Thread.sleep(1000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("在沉睡中被停止"+this.isInterrupted());
            e.printStackTrace();
        }
    }
}

