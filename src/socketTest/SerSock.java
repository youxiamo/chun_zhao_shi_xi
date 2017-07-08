package socketTest;

/**
 * Created by Administrator on 2017/5/22 0022.
 */
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

class ThSer implements Runnable{

    //ScriptEngine jScriptEngine=new ScriptEngineManager().getEngineByName("JavaScript");

    int getNum(String s){

        int a = 0;
	/*	try {
		 a=(int)jScriptEngine.eval(s);
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		*/
        s=s.substring(1,s.length());
        System.out.println("--"+s);

        int num=0;
        char c='0';
        int []n1=new int[10];
        int count=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                num=num*10;
                num=num+(s.charAt(i)-'0');

            }
            else {c=s.charAt(i);
                n1[count++]=num;
                //System.out.println(num);
                num=0;}

        }

        n1[count++]=num;
        System.out.println(n1[0]+"叫姐姐姐姐姐姐"+n1[1]);
        switch (c) {
            case '+':return n1[0]+n1[1];
            case '-':return n1[0]-n1[1];
            case '*':return n1[0]*n1[1];
            case '/':return n1[0]/n1[1];

        }


        return a;
    }


    Socket socket;

    public ThSer(Socket socket ) {
        // TODO Auto-generated constructor stub

        this.socket=socket;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub

        try {
            InputStream in=socket.getInputStream();
            OutputStream out=socket.getOutputStream();
            //PrintWriter pWriter=new PrintWriter(out);
            //BufferedReader reader=new BufferedReader(new InputStreamReader(in));
            DataInputStream dataInputStream=new DataInputStream(in);
            DataOutputStream dataOutputStream=new DataOutputStream(out);

            dataOutputStream.writeUTF("hellow you are clint form server");

            while(true){
                //out.write("hellow".getBytes("df"));
                //out.flush();
                //pWriter.write("hellow");
                //pWriter.flush();

                String s=dataInputStream.readUTF();
                System.out.println(s);

                if(s.charAt(0)=='|'){
                    int result=getNum(s);
                    System.out.println("进入运算"+result);

                    dataOutputStream.writeUTF("jie guo --"+result);
                    dataOutputStream.flush();
                    Thread.sleep(12);;

                }else {
                    System.out.println("返回");
                dataOutputStream.writeUTF("");
                dataOutputStream.flush();

                }

            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }



}


public class SerSock {

    public static void main(String []atgs){

        try {
            ServerSocket serverSocket=new ServerSocket(10086);

            while(true ){
                Socket socket=serverSocket.accept();
                ThSer server=new ThSer(socket);
                Thread tt=new Thread(server);
                tt.start();
            }



        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



    }

}
