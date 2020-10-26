package Volatitle.t16;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-23 13:52
 **/

public class RunThread extends Thread{
    volatile private boolean isRunning = true;
    public boolean isRunning() {
        return  isRunning;
    }
    public void setRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

    @Override
    public void run() {
        System.out.println("进入run了");
        while(isRunning == true) {}
        System.out.println("线程被停止了!");
    }
}

