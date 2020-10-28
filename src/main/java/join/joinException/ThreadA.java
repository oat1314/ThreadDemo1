package join.joinException;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-28 17:28
 **/

public class ThreadA extends Thread{
    @Override
    public void run() {
        for (int i=0;i<Integer.MAX_VALUE;i++) {
            String newString = new String();
            Math.random();
        }
    }
}

