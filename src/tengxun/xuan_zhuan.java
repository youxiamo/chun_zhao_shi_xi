package tengxun;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/2 0002.
 */
class Node<E>{
    Node<E> data;
    Node lc;
    Node Rc;
}
public class xuan_zhuan {
    static void pan(int n,int m){
        int [][]dp=new int[35][35];
        dp[0][1]=1;
        dp[1][n]=1;
        dp[1][2]=1;
        for(int i=1;i <= m;i++) {
            for(int j=1;j <= n;j++) {
                if(j == 1)
                    dp[i][j]=dp[i-1][n]+dp[i-1][2];
                else if(j==n)
                    dp[i][j]=dp[i-1][1]+dp[i-1][n-1];
                else
                    dp[i][j]=dp[i-1][j-1]+dp[i-1][j+1];
            }
        }
        System.out.print(dp[m][1]);
    }
    public static  void main(String []args){
        Scanner in=new Scanner(System.in);
        {
            int a=in.nextInt();
            int b=in.nextInt();
            pan(a,b);
        }
    }
}
