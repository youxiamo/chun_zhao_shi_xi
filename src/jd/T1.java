package jd;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/7 0007.
 */
public class T1 {

    static void pan(String s){
        char []c=s.toCharArray();
        int count=0;
        boolean []num=new boolean[s.length()];
        for(int i=0;i<s.length();i++)num[i]=false;

        for(int i=0;i<s.length();i++) {
            if (c[i] >= '1' && c[i] <= '9') {
                int fan = c[i] - '0';
                int j = i - fan;
                if (j <= 0) j = 0;
                for (; j <=(i + fan )&& j<s.length(); j++) {
                    if (!num[j] && c[j] == 'X') {
                        count++;
                        num[j] = true;
                    }
                }
            }
        }

        System.out.println(count);
     //   for(int i=0;i<s.length();i++)if(num[i])System.out.println(i);

    }

    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String s=in.nextLine();
            String ca=in.nextLine();

            pan(ca);

        }
    }
}
