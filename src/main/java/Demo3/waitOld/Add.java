package Demo3.waitOld;


/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-27 17:04
 **/

public class Add {
    private String lock;

    public Add(String lock) {
        super();
        this.lock = lock;
    }
    public void add() {
        synchronized (lock) {
            ValueObject.list.add("anyString");
            lock.notifyAll();
        }
    }
}

