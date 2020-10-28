package Stream.wait_notify_insert_test;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-28 17:05
 **/

public class BackupA extends Thread{

    private DBTools dbTools;

    public BackupA(DBTools dbTools) {
        super();
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupA();
    }
}

