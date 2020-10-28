package Stream.pipInputOutput;

import java.io.PipedOutputStream;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-28 13:52
 **/

public class WriteData {
    public void writeData(PipedOutputStream out) {
        try {
            System.out.println("write:");
            for(int i = 0; i < 300; i++) {
                String outData = "" +(i+1);
                out.write(outData.getBytes());
                System.out.println(outData);
            }
            System.out.println();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

