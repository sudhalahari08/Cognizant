import java.net.*;
import java.io.*;

public class Server{

    public static void main(String[] args) throws Exception {

        ServerSocket ss = new ServerSocket(5000);

        System.out.println("Waiting...");

        Socket socket = ss.accept();

        BufferedReader br =
            new BufferedReader(
                new InputStreamReader(
                    socket.getInputStream()
                )
            );

        String msg = br.readLine();

        System.out.println("Client: " + msg);

        ss.close();
    }
}
