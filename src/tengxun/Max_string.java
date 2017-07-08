package tengxun;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/2 0002.
 */
public class Max_string {
    static void pan(String s1,String s2){
        char []c1=s1.toCharArray();
        char []c2=s2.toCharArray();
        int [][]dp=new int[c1.length+1][c2.length+1];

        int result=0;
        for(int i=0;i<=c1.length;i++)
            for(int j=0;j<=c2.length;j++)
            {
                if(i==0||j==0)dp[i][j]=0;
                else if(c1[i]==c2[j]){
                    dp[i][j]=dp[i-1][j-1];
                    result=Math.max(dp[i][j],result);
                }else {
                    dp[i][j]=0;
                }

            }

    }
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        {
            String s1=in.nextLine();
            String s2=in.nextLine();
            pan(s1,s2);
        }
    }
}
