package Stream.pepeReaderWriter;

import java.io.PipedReader;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-28 16:48
 **/

public class ThreadRead extends Thread{

    private ReadData readData;
    private PipedReader input;

    public ThreadRead(ReadData readData, PipedReader input) {
        super();
        this.readData = readData;
        this.input = input;
    }

    @Override
    public void run() {
        readData.readMethod(input);
    }
}

