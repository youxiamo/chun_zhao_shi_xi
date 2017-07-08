package socketTest;

import java.io.IOException;
import java.net.Socket;

/**
 * Created by Administrator on 2017/5/22 0022.
 */
public class clinkBio {
    public static void main(String []args){
        Socket socket=null;
        try {
            socket=new Socket("127.0.0.1",10886);

            while(true){


            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
