package tengxun;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/2 0002.
 */
public class cha_xioa {
    static void pan(int num[]){
        int min=100000000;
        int mCon=0;
        for(int i=0;i<num.length-1;i++){
            if(num[i+1]-num[i]<min){
                min=num[i+1]-num[i];
                mCon=1;
            }else if(num[i+1]-num[i]==min)mCon++;
        }
        int Max=num[num.length-1]-num[0];
        int xCon=1;
        for(int i=0,j=num.length-1;i<j;i++,j--){
            if(num[j]-num[i]==Max)xCon++;
        }

System.out.println(mCon+" "+xCon);

    }
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=Integer.parseInt(in.nextLine());
            String []s=in.nextLine().split(" ");
            int []num=new int[n];
            for(int i=0;i<n;i++){
                num[i]=Integer.parseInt(s[i]);
            }
            Arrays.sort(num);
            for(int i=0;i<n;i++){
             //   System.out.print(num[i]);
            }
            pan(num);
        }
    }
}
