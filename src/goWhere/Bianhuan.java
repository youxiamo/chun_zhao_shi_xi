package goWhere;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/1 0001.
 */
public class Bianhuan {
    static void pan(String s[],String first,String end){



    }
    public static void main(String []atgs){
        Scanner in=new Scanner(System.in);

        while(in.hasNext()){
            String first=in.nextLine();
            String end=in.nextLine();
            String s=in.nextLine();
            String []s1=s.split(" ");
            pan(s1,first,end);
        }

    }
}
