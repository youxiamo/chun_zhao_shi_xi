package goWhere;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/1 0001.
 */
public class Main3 {

    static int pan(String first,String end,String s[]){
        for(int i=0;i<s.length;i++){}

        int x=s.length;
        int [][]num=new int[first.length()+1][first.length()+1];
        int []n1=new int[x];
        int []n2=new int[x];
        int temp=100000000;
        String z=first;
        for(int i=0;i<x;i++){
            for(int j=1;j<s.length;j++)
            if(pj(z,s[i])==1);num[i][i]=1;


        }
        return temp;
    }
    static int pj(String a,String b){
        int num=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i))num++;
        }
        return num;
    }
    public static void main(String []atgs){
        Scanner in=new Scanner(System.in);

        while(in.hasNext()){
            String first=in.nextLine();
            String end=in.nextLine();
            String []s1=in.nextLine().split(" ");
            int []fi=new int[first.length()];
            for(int i=0;i<first.length();i++){
                if(first.charAt(i)!=end.charAt(i))fi[i]=1;
                else fi[i]=0;
            }
            int x;
            if(first.equals(end))System.out.println(1);
            else {System.out.println(1+pan(first,end,s1));
            }

        }

    }
}
