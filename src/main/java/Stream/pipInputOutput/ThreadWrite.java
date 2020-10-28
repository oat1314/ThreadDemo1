package Stream.pipInputOutput;

import java.io.PipedOutputStream;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-28 15:11
 **/

public class ThreadWrite extends Thread{
    private WriteData writeData;
    private PipedOutputStream out;

    public ThreadWrite(WriteData writeData,PipedOutputStream out) {
        super();
        this.writeData = writeData;
        this.out = out;
    }

    @Override
    public void run() {
        writeData.writeData(out);
    }
}

