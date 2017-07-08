package tengxun;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/2 0002.
 */
public class da_xie {
    static void pan(String s){
        char []c=s.toCharArray();
        for(int j=0;j<s.length();j++){
            for(int i=0;i<s.length()-1;i++){
                if(c[i]<='Z'&&c[i+1]>='a'){
               char temp=c[i];

               c[i]=c[i+1];
                c[i+1]=temp;
                }
            }

        }
        System.out.println(c);
    }
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        {
            String s=in.nextLine();
            pan(s);
        }
    }
}
