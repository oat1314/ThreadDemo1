package Stream.pepeReaderWriter;

import java.io.PipedWriter;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-28 16:47
 **/

public class ThreadWrite extends Thread{

    private WriteData writeData;
    private PipedWriter out;

    public ThreadWrite(WriteData writeData, PipedWriter out) {
        super();
        this.writeData = writeData;
        this.out = out;
    }

    @Override
    public void run() {
        writeData.wirteMethod(out);
    }
}

