package Demo123.singleton_0;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-29 17:57
 **/

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}

