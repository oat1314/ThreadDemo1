package Demo123.singleton_02;

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
        try {
            //延迟加载
            if(myObject != null) {
            } else {
                //模拟在创建对象之前做一些准备性的工作
                Thread.sleep(3000);
                myObject = new MyObject();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}

