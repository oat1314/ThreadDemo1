package Demo.suspend_resume_test;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-20 18:17
 **/

public class MyThread extends Thread{
    private long i = 0;
    public long getI() {
        return i;
    }
    public void setI(){
        this.i = i;
    }

    @Override
    public void run() {
        while (true) {
            i++;
        }
    }
}

