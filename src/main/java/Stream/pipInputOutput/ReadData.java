package Stream.pipInputOutput;

import java.io.PipedInputStream;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-28 14:30
 **/

public class ReadData {
    public void readMethod(PipedInputStream input) {
        try {
            System.out.println("read:");
            byte[] byteArray = new byte[20];
            int readLength = input.read(byteArray);
            while (readLength!=-1){
                String newData = new String(byteArray,0,readLength);
                System.out.print(newData);
                readLength = input.read(byteArray);
            }
            System.out.println();
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

