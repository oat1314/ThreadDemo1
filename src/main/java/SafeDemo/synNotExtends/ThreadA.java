package SafeDemo.synNotExtends;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-22 10:01
 **/

public class ThreadA extends Thread{
    private Sub sub;

    public ThreadA(Sub sub) {
        super();
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.serviceMethod();
    }
}

