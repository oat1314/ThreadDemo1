package SafeDemo.t2;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-21 10:34
 **/

public class HaselfPrivateNum {
    private int num = 0;
    synchronized public void addI(String username) {
        try {
            if(username.equals("a")) {
                num =100;
                System.out.println("a set over!");
                Thread.sleep(2000);
            } else {
                num =200;
                System.out.println("b set over!");
            }
            System.out.println(username + "num="+num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

