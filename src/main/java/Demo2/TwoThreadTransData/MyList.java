package Demo2.TwoThreadTransData;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-23 17:12
 **/

public class MyList {
    private List list = new ArrayList();
    public void add() {
        list.add("离谱");
    }
    public int size(){
        return list.size();
    }


}

