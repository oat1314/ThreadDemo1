package Demo.t13;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-20 17:29
 **/

public class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0;i <50000;i++) {
            if (this.isInterrupted()) {
                System.out.println("已经是停止状态了!我要退出!");
                break;
            }
            System.out.println("i="+(i+1));
        }
    }
}

