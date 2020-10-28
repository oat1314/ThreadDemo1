package Demo3.waitOld;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-27 17:16
 **/

public class ThreadSubtract extends Thread{
    private Subtract r;

    public ThreadSubtract(Subtract r) {
        super();
        this.r = r;
    }

    @Override
    public void run() {
        r.subtract();
    }
}

