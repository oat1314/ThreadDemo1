package Stream.pipInputOutput;

import java.io.PipedInputStream;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-28 15:19
 **/

public class ThreadRead extends Thread{

    private ReadData readData;
    private PipedInputStream inputStream;

    public ThreadRead(ReadData readData, PipedInputStream inputStream) {
        super();
        this.readData = readData;
        this.inputStream = inputStream;
    }

    @Override
    public void run() {
        readData.readMethod(inputStream);
    }
}

