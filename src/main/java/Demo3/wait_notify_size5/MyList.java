package Demo3.wait_notify_size5;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-26 09:31
 **/

public class MyList {
    private static List list = new ArrayList();
    public static void add() {
        list.add("anyString");
    }
    public static int size(){
        return list.size();
    }


}

