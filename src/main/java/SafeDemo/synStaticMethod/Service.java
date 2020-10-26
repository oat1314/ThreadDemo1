package SafeDemo.synStaticMethod;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-23 10:07
 **/

public class Service {
    synchronized public static void printA() {
        try {
            System.out.println("线程名称为:"+Thread.currentThread().getName() + "在" +System.currentTimeMillis()+"进入printA");
            Thread.sleep(3000);
            System.out.println("线程名称为:"+Thread.currentThread().getName() + "在" +System.currentTimeMillis()+"离开printA");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    synchronized public static void printB(){
        System.out.println("线程名称为:"+Thread.currentThread().getName() + "在" +System.currentTimeMillis()+"进入printB");
        System.out.println("线程名称为:"+Thread.currentThread().getName() + "在" +System.currentTimeMillis()+"离开printB");
    }

}

