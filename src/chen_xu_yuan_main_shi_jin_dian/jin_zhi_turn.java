package chen_xu_yuan_main_shi_jin_dian;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/30 0030.
 */
public class jin_zhi_turn {

    static void pan(int a){
        String n1=Integer.toBinaryString(a);
        System.out.println(n1);
        char[] c=n1.toCharArray();
        // 变小
        boolean flag=false;int i;
        int count=0;
        for( i=c.length-1;i>=0;i--){
            if(c[i]=='0')flag=true;
            else if(flag&&c[i]=='1'){
                c[i]='0';
                c[i+1]='1';
                break;
            }
            if(c[i]=='1'){c[i]='0';count++;}//记录1的个数
        }

        // 把后面的1尽量放左面变大
        int j = i + 2;
        while(count>0&& j<c.length) {
            c[j++]='1';
            count--;
        }

        System.out.println(c);

        c=n1.toCharArray();
        flag=false;
        count=0;
        for(i=c.length-1;i>=0;i--){
            if(c[i]=='1')flag=true;
            else if(flag&&c[i]=='0'){
                c[i]='1';
                c[i+1]='0';
                break;
            }
            if(c[i]=='1'){count++;c[i]='0';}
        }
        count--;
        j=c.length-1;
        while(count>0){
            c[j--]='1';
            count--;
        }

        System.out.println(c);




    }

    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
       // System.out.println(Integer.toBinaryString(a));
        pan(a);


        int []x={3,6,5,3,7};
        int count=0;
        for(int i=0;i<x.length;i++){
            count^=x[i];
        }
        System.out.println(count);
    }
}
