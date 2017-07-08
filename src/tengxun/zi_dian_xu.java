package tengxun;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/2 0002.
 */
public class zi_dian_xu {

    static void pan(String a,String b,int l1,int l2 ){


    }

    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String []s=in.nextLine().split(" ");
            int l1=Integer.parseInt(s[2]);
            int l2=Integer.parseInt(s[3]);
            pan(s[0],s[1],l1,l2);
        }
    }
}
