package Demo.netty;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-22 14:00
 **/

public class PublishClient {
    public static void main(String[] args) throws IOException {
        Socket socket = null;
        OutputStream out = null;

        try {
            socket = new Socket("localhost",8080);
            out = socket.getOutputStream();
            out.write("Hello\r\n".getBytes());
            out.flush();
        } finally {
            out.close();
            socket.close();
        }
    }


}

