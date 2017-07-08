package socketTest;

/**
 * Created by Administrator on 2017/5/22 0022.
 */

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientSock {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String host="127.0.0.1";
        int port=10086;
        Socket socket=null;
        try {
            socket=new Socket(host, port);
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        OutputStream out;
        try {
            out = socket.getOutputStream();
            //PrintWriter pWriter=new PrintWriter(out);
            //pWriter.write("zhi shi jia");
            //pWriter.flush();
            InputStream in=socket.getInputStream();

            DataInputStream dataInputStream=new DataInputStream(in);
            DataOutputStream dataOutputStream=new DataOutputStream(out);

            dataOutputStream.writeUTF("this is client talk to you");
            Scanner in1=	new Scanner(System.in);
            System.out.println(dataInputStream.readUTF());

            while(true){

                String s=in1.nextLine();
                //s='|'+s;
                dataOutputStream.writeUTF(s);
                //System.out.println(s+"zai ke huduan");
                String reponse=dataInputStream.readUTF();
                if(!reponse.equals(""))
                System.out.println(reponse);

            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



    }

}
