package Demo.suspend_resume_deal_lock;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-20 18:46
 **/

public class SychronizedObject {
    synchronized public void printString() {
        System.out.println("begin");
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("a线程永远suspend了!");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }


}

