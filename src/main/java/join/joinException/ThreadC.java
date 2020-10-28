package join.joinException;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-28 17:35
 **/

public class ThreadC extends Thread{
    private ThreadB threadB;

    public ThreadC(ThreadB threadB) {
        super();
        this.threadB = threadB;
    }

    @Override
    public void run() {
        threadB.interrupt();
    }
}

