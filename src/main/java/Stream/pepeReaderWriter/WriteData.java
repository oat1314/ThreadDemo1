package Stream.pepeReaderWriter;

import java.io.PipedWriter;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-28 16:38
 **/

public class WriteData {
    public void wirteMethod(PipedWriter out) {
        try {
            System.out.println("write:");
            for (int i=0;i<300;i++) {
                String outData =""+(i+1);
                out.write(outData);
                System.out.println(outData);
            }
            System.out.println();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

