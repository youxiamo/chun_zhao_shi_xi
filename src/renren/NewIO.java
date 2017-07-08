package renren;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/9 0009.
 */
public class NewIO {
    static void pan(int n,int Li[]){
        if(n==1){System.out.println(Li[0]);return;}
        int []ma=new int[n-1];
        int c=zui(Li[0],Li[1]);
        for(int i=2;i<n;i++) {

            c = zui(c, Li[i]);
           // System.out.println(ma[i-1]);
        }

        System.out.println(c);
    }
    static int zui(int a,int b){
        if(b==0)return a;
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
            pan(n,Li);
        }
    }
}
