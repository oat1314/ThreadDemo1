package Demo123.singleton_1;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-29 17:55
 **/

public class MyObject {
    private static MyObject myObject;

    public MyObject() {
    }
    public static MyObject getInstance() {
       //延迟加载
        if(myObject != null) {
        } else {
            myObject = new MyObject();
        }
        return myObject;
    }
}

