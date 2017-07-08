package xie_cheng;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/11 0011.
 */
public class Main {

    static int max=0;
    private static int getMaxProfit(int n,int stockPrice[],int k) {
        int cur=-1000000000, ans=0;
        int dp[] = new int[n+1];
        for(int i=1;i<=n;i++){
            dp[i] = Integer.max(stockPrice[i]+cur, dp[i-1]);
            System.out.println(dp[i-1]);
            if(i>=k){
                cur = Integer.max(cur, dp[i-k]-stockPrice[i]);
            }else{
                cur = Integer.max(cur, -stockPrice[i]);
            }
            ans = Integer.max(ans, dp[i]);
        }
        return ans;
    }


    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n=in.nextInt();
            int []a=new int[n+1];
            for(int i=1;i<=n;i++){
                a[i]=in.nextInt();
            }
            int k=in.nextInt();
            System.out.println("----"+getMaxProfit(n,a,k));
        }
    }
}
