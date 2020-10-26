package SafeDemo.t7;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-22 10:13
 **/

public class Task {
    public void doLongTimeTask() {
        for (int i=0;i<100;i++) {
            System.out.println("nosynchronized threadName="+Thread.currentThread().getName()+"i="+(i+1));
        }
        System.out.println("");
        synchronized (this) {
            for (int i=0;i < 100;i++) {
                System.out.println("synchronized threadName= "+Thread.currentThread().getName()+"i="+(i+1));
            }
        }
    }


}

