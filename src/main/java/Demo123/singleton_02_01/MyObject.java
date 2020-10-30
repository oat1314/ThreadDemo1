package Demo123.singleton_02_01;



/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-30 17:07
 **/

public class MyObject {
    private static MyObject myObject;

    public MyObject() {
    }
    synchronized public static MyObject getInstance() {
        try {
            if (myObject!=null) {
            } else{
                Thread.sleep(3000);
                myObject = new MyObject();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}

