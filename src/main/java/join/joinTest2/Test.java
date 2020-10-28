package join.joinTest2;

import join.joinTest1.MyThread;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-28 17:16
 **/

public class Test {
    public static void main(String[] args) {
        try {
            MyThread threadTest = new MyThread();
            threadTest.start();
            threadTest.join();
            System.out.println("我想当threadTest对象执行完毕后我再执行,我做到了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}

