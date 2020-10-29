package Timer.timerTest1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-29 16:47
 **/

public class Run1 {
    private static Timer timer = new Timer();
    static public class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("运行了!时间为:"+new Date());
        }
    }

    public static void main(String[] args) {
        try {
            MyTask myTask = new MyTask();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "2020-10-29 11:55:00";
            Date dateRef = sdf.parse(dateString);
            System.out.println("字符串时间"+dateRef.toLocaleString()+"当前时间:"+new Date().toLocaleString());
            timer.schedule(myTask,dateRef);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}

