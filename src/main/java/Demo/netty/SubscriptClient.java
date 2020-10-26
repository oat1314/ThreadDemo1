package Demo.netty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-22 14:02
 **/

public class SubscriptClient {
    public static void main(String[] args) throws IOException {

        Socket socket = null;
        BufferedReader in = null;

        try {
            socket = new Socket("localhost",8080);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            while (true) {
                String line = in.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } finally {
            in.close();
            socket.close();
        }

    }


}

