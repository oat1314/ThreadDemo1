package Stream.wait_notify_insert_test;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-28 17:03
 **/

public class Run {
    public static void main(String[] args) {
        DBTools dbTools = new DBTools();
        for (int i=0;i<20;i++) {
            BackupB output = new BackupB(dbTools);
            output.start();
            BackupA input = new BackupA(dbTools);
            input.start();
        }
    }


}

