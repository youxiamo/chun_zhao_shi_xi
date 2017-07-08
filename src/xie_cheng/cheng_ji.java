package xie_cheng;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/11 0011.
 */
public class cheng_ji {

    static void pan(int n){
        if(n<=2){System.out.println(n);return;}

        int a=2;
        int []in=new int[100];
        int i=0;
        for(i=0;i<100;i++)in[i]=0;
        i=0;
        while(n>=a) {
            in[i++] = a;
            n -= a;
            a++;
        }
            if (n == in[i - 1]) {
                in[i - 1]++;
                n--;
            }
            for (int j = 0; j < n; j++) in[i - 1 - j]++;

        int result=1;
        for(int j=0;j<=i-1;j++)result*=in[j];

        System.out.println(result);
    }

    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int n=in.nextInt();
            pan(n);


        }
    }
}
