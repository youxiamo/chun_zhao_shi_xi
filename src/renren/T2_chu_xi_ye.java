package renren;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/9 0009.
 */
public class T2_chu_xi_ye {


    static void pan(int n,int m){
        if(m>235||n==0){System.out.println(0);return;}


        m=240-m;// 总时间
        int []num=new int[n];
        int i;
        for(i=1;i<=n;i++){
            m=m-i*5;
            if(m<=0||m<(i+1)*5)break;
        }
        if(i>n)i=n;
        System.out.println(i);
    }

    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int n=Integer.parseInt(in.nextLine());
            int m=Integer.parseInt(in.nextLine());
            pan(n,m);

        }
    }
}
