package Stream.wait_notify_insert_test;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-28 16:58
 **/

public class DBTools {
    volatile private  boolean pervIsA = false;
    synchronized public void  backupA() {
        try {
            while (pervIsA == true) {
                wait();
            }
            for (int i=0;i<5;i++) {
                System.out.println("★★★★★");
            }
            pervIsA = true;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    synchronized public void  backupB() {
        try {
            while (pervIsA == false) {
                wait();
            }
            for (int i=0;i<5;i++) {
                System.out.println("☆☆☆☆☆");
            }
            pervIsA = false;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}

