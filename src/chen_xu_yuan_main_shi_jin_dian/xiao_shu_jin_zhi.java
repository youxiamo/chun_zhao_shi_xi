package chen_xu_yuan_main_shi_jin_dian;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/5/1 0001.
 */
public class xiao_shu_jin_zhi {

    static void pan(double a){
        StringBuffer s=new StringBuffer();
        int count=0;
        s.append('.');
        while(a>0){
            count++;
            if(count>32)break;
            a=a*2;
            if(a>=1){s.append('1');a-=1;}
            else s.append('0');
        }
        if(count==33)System.out.println("error");
        else System.out.println(s);
        String x=new String(s);

    }

    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        //int a=in.nextInt();
        double a=in.nextDouble();
        // System.out.println(Integer.toBinaryString(a));
        pan(a);
    }
}
