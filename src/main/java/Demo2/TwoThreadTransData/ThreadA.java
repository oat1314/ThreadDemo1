package Demo2.TwoThreadTransData;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-23 17:13
 **/

public class ThreadA extends Thread{
    private MyList myList;

    public ThreadA(MyList myList) {
        super();
        this.myList = myList;
    }

    @Override
    public void run() {
        try {
            for (int i=0;i<10;i++) {
                myList.add();
                System.out.println("添加了"+(i+1)+"个元素");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

