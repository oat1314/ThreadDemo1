package Demo.suspend_resume_deal_lock;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-20 18:48
 **/

public class Run {
    public static void main(String[] args) {
        try {
            final SychronizedObject object = new SychronizedObject();
            Thread thread = new Thread() {
                @Override
                public void run() {
                    object.printString();
                }
            };
            thread.setName("a");
            thread.start();
            Thread.sleep(1000);
            Thread thread2 = new Thread(){
                @Override
                public void run() {
                    System.out.println("thread2启动了,但进入不了printString()方法!只打印一个begin");
                    System.out.println("因为pringtString()方法被a线程锁定并且永远suspend暂停了!");
                    object.printString();
                }
            };
            thread2.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

