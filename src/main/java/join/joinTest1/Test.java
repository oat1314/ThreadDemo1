package join.joinTest1;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-28 17:16
 **/

public class Test {
    public static void main(String[] args) {
        MyThread threadTest = new MyThread();
        threadTest.start();
        System.out.println("我想当threadTest对象执行完毕后我再执行");
        System.out.println("但上面代码汇总的sleep()中的值应该写多少呢");
        System.out.println("答案是:根据不能确定:)");
    }


}

