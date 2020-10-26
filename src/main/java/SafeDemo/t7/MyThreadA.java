package SafeDemo.t7;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-22 10:16
 **/

public class MyThreadA extends Thread{

    private Task task;

    public MyThreadA(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}

