package renren;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/9 0009.
 */
public class te1 {
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
            //System.out.print(zui(Li[0],Li[1]));
            if(n==1)System.out.println(Li[0]);
            else {
                int a = zui(Li[0], Li[1]);
                for (int i = 1; i < n; i++)
                    a = zui(a, Li[i]);
                System.out.print(a);
            }
        }
    }
}
