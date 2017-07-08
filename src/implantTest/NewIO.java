package implantTest;

import java.nio.ByteBuffer;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/9 0009.
 */
public class NewIO {
    static void pan(int n,int Li[]){

    }
    static int zui(int a,int b){
        if(a==0)return 1;
        else return zui(b,a%b);
    }
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int n=Integer.parseInt(in.nextLine());
            String []s=in.nextLine().split(" ");
            int []Li=new int[n];
            for(int i=0;i<n;i++)
                Li[i]=Integer.parseInt(s[i]);

        }
    }
}
