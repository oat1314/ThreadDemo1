package join.joinException;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-28 17:36
 **/

public class Run {
    public static void main(String[] args) {
        try {
            ThreadB b = new ThreadB();
            b.start();
            Thread.sleep(500);
            Thread c =new ThreadC(b);
            c.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

