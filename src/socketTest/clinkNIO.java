package socketTest;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/5/22 0022.
 */


public class clinkNIO {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            try {
                //黑客江湖
                String address="127.0.0.1";
                int hostPort=10086;
                SocketChannel socketChannel=SocketChannel.open();
                socketChannel.configureBlocking(false);

                if(!socketChannel.connect(new InetSocketAddress(address,hostPort))){

                }

                ByteBuffer writeBuf=ByteBuffer.wrap("fdsf".getBytes());
                ByteBuffer readBuf=ByteBuffer.allocate(122);




            } catch (IOException e) {
                e.printStackTrace();
            }

        }


        System.out.println("-");
    }
}
