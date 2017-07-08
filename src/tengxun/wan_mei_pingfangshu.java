package tengxun;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/2 0002.
 */
public class wan_mei_pingfangshu {

    static void pan(int n,int a[]){
            int root =(int)Math.pow(2,n)/2;
            System.out.println(root);



    }

    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            int []a=new int[3];
             a[1]=in.nextInt();
            a[2]=in.nextInt();
            a[3]=in.nextInt();
            Arrays.sort(a);
            pan(n,a);
        }
    }
}
