package tengxun;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/3 0003.
 */
public class pan_suan {

    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String s=in.nextLine();
            char []c=s.toCharArray();
            String sTemp="00000000 ";
            int num=0;
            String a="";
            for(int i=0;i<s.length();i++){
                sTemp += Integer.toHexString(0xFF & c[i])+" ";
                a+=c[i];
                if(i!=0&&i%15==0||i==s.length()-1){
                    num++;
                    sTemp+=a;
                    a="";
                    System.out.println(sTemp);
                    sTemp="000000"+num+"0 ";}


            }


        }
    }
}
