package Volatitle.atomicIntergerNosafe;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-23 14:19
 **/

public class MyThread extends Thread{
    private MyService myService;
    public MyThread(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.addNum();
    }
}

