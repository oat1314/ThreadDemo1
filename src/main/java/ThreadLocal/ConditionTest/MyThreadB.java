package ThreadLocal.ConditionTest;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-29 14:58
 **/

public class MyThreadB extends Thread{
    private MyService myService;

    public MyThreadB(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++) {
            myService.get();
        }
    }
}

