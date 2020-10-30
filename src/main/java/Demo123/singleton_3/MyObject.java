package Demo123.singleton_3;



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
                if (myObject!=null) {
                } else{
                    Thread.sleep(3000);
                    synchronized (MyObject.class){
                        if (myObject == null){
                            myObject = new MyObject();
                        }
                    }
                }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}

