package Stream.wait_notify_insert_test;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-28 17:05
 **/

public class BackupB extends Thread{

    private DBTools dbTools;

    public BackupB(DBTools dbTools) {
        super();
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupB();
    }
}

