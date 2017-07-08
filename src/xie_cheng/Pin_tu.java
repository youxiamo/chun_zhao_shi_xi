package xie_cheng;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/11 0011.
 */
public class Pin_tu{
    static int max=100000;
    static void pan(int [][] n,int a,int b){
        if(cha(n)==0)return;
        if(a==0){
            if(b==0)change(n,a,b);
        }
    }
    static void change(int [][]n,int a,int b){

    }
    static int cha(int [][]n) {

        int count = 0;
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                if (n[i][j] != (i * 3 + j)) count++;
            }
        }
        return count;
    }
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int [][]n=new int[3][3];
            int a=0;int b=0;
           for(int i=0;i<3;i++) {
               String []s=in.nextLine().split(" ");
               for (int j = 0; j < 3; j++) {
                    n[i][j]=Integer.parseInt(s[j]);
                    if(n[i][j]==0){a=i;b=j;}
               }
           }
           pan(n,a,b);
        }
    }
}