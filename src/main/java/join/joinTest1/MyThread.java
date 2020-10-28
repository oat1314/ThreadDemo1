package join.joinTest1;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-28 17:15
 **/

public class MyThread extends Thread{
    @Override
    public void run() {
        try {
            int sercondValue =(int) (Math.random()*1000);
            System.out.println(sercondValue);
            Thread.sleep(sercondValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

