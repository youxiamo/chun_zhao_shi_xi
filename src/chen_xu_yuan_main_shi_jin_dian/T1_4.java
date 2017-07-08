package chen_xu_yuan_main_shi_jin_dian;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/27 0027.
 */
public class T1_4 {

    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        {
            String s=in.nextLine();
            String a=s.replaceAll(" ","%20");
            System.out.println(a);
            int count=0;
            for(int i=0;i<s.length();i++)
                if(s.charAt(i)==' ')count++;
            count*=2;
            char[] b=new char[s.length()+count];
            for(int i=s.length()-1;i>=0;i--){
                if(s.charAt(i)==' '){
                    b[i+count]='0';b[i+count-1]='2';b[i+count-2]='%';
                    count-=2;
                }
                else b[i+count]=s.charAt(i);
            }

            System.out.print(b);

        }
    }
}
