package Demo3.waitOld;

import SafeDemo.synNotExtends.Sub;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-27 17:28
 **/

public class Run {
    public static void main(String[] args) throws InterruptedException{
        String lock = new String("");
        Add add = new Add(lock);
        Subtract subtract = new Subtract(lock);
        ThreadSubtract subtract1Thread = new ThreadSubtract(subtract);
        subtract1Thread.setName("subtracThread");
        subtract1Thread.start();
        ThreadSubtract subtract2Thread = new ThreadSubtract(subtract);
        subtract2Thread.setName("subtrac2Thread");
        subtract2Thread.start();
        ThreadAdd addThread = new ThreadAdd(add);
        addThread.setName("addThread");
        addThread.start();
    }


}

