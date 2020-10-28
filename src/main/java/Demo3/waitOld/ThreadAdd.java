package Demo3.waitOld;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-27 17:15
 **/

public class ThreadAdd extends Thread{
    private Add p;

    public ThreadAdd(Add p) {
        super();
        this.p = p;
    }

    @Override
    public void run() {
        p.add();
    }
}

