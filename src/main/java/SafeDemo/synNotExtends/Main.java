package SafeDemo.synNotExtends;

import SafeDemo.synchronizedMethodLockObject.ThreadB;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-22 09:56
 **/

public class Main {
    synchronized public void serviceMethod() {
        try {
            System.out.println("int main下一步 sleep begin threadName="
            + Thread.currentThread().getName()+"time"+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int main 下一步sleep begin threadName"
            +Thread.currentThread().getName()
            +System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

