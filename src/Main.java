import java.io.IOException;

/**
 * @program: SimpleHttpServer
 * @description:
 * @author: Ya
 * @create: 2019-11-26 18:42
 **/
public class Main {
    public static void main(String[] args) {
        try {
            SimpleHttpServer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
