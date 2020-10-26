package SafeDemo.t7;



/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-22 10:17
 **/

public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        MyThreadA myThreadA = new MyThreadA(task);
        myThreadA.start();
        MyThreadB myThreadB = new MyThreadB(task);
        myThreadB.start();

    }


}

