package Demo.t7;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-19 14:50
 **/

public class Run1 {

    public static void main(String[] args) {
        CountOperate c = new CountOperate();
        Thread t1 = new Thread(c);
        System.out.println("main begin t1 isAlive="+t1.isAlive());
        t1.setName("A");
        t1.start();
        System.out.println("main end t1 isAlive="+t1.isAlive());
    }

}

