package ThreadLocal.z3_ok;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-29 13:54
 **/

public class MyThreadA extends Thread {
    private MyService myService;

    public MyThreadA(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.waitMethod();
    }
}

