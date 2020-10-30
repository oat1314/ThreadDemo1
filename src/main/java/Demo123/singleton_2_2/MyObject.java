package Demo123.singleton_2_2;



/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-30 17:07
 **/

public class MyObject {
    private static MyObject myObject;

    public MyObject() {
    }
    public static MyObject getInstance() {
        try {
            synchronized (MyObject.class) {
                if (myObject!=null) {
                } else{
                    Thread.sleep(3000);
                    myObject = new MyObject();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}

