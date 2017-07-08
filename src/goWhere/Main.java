package goWhere;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/1 0001.
 */
public class Main {
    static void pan(char c[]){
        if(c.length==0){System.out.println(0);return;}
        BigInteger num=new BigInteger("0");
        BigInteger s26= new BigInteger("26");
        for(int i=0;i<c.length-1;i++){
            BigInteger x=BigInteger.valueOf(c[i]-'a');
           num= num.add(x);
            num=num.multiply(s26);

        }
        //num+=c[c.length-1]-'a';
        num=num.add(BigInteger.valueOf(c[c.length-1]-'a'));
        System.out.println(num);
    }
    public static void main(String []atgs){
        Scanner in=new Scanner(System.in);

        while(in.hasNext()){
            String s=in.nextLine();
            char[] c=s.toCharArray();
            pan(c);
        }

    }
}
