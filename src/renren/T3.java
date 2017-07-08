package renren;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/9 0009.
 */
public class T3 {

    static void pan(int n,int a[]){

        if(n<=1){System.out.println(1);return;}

        int count=0;
        int num=0;
        for(int i=0;i<n;i++){
            num+=a[i];
        }
        if(num%2!=0){System.out.println(0);return;}

        int nu=0;
        for(int i=0;i<n-1;i++){
            nu+=a[i];
            if(nu==num/2)count++;
        }

        System.out.println(count);
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
