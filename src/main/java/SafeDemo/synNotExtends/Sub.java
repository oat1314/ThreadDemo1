package SafeDemo.synNotExtends;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-22 09:58
 **/

public class Sub extends Main{
    @Override
    public synchronized void serviceMethod() {
        try {
            System.out.println("int sub 下一步sleep begin threadName="
            +Thread.currentThread().getName()
            +System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int sub下一步sleep end threadName="
            +Thread.currentThread().getName()
            +System.currentTimeMillis());
            super.serviceMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

