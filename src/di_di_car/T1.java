package di_di_car;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/5/7 0007.
 */
public class T1 {
    static void pan(String []s1,int []num){
        if(s1==null)return;

        int []count=new int[s1.length];// 保存相似度
        for(int x=0;x<s1.length;x++) {
            String s=s1[x];
            int[][] dp = new int[s.length() + 1][num.length + 1];
            for (int i = 0; i <= s.length(); i++) {
                for (int j = 0; j <= num.length; j++) {
                    if (i == 0 || j == 0) dp[i][j] = 0;
                    else if (getM(s.charAt(i - 1), num[j - 1])) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                    }
                }
            }

            count[x]=dp[s.length()][num.length];

        }

        int max=count[0];int xia=0;
        for(int x=1;x<s1.length;x++) {
            if(count[x]>max){max=count[x];xia=x;}

        }
        System.out.println(s1[xia]);

    }

    static boolean getM(char c,int a){
        String []s={"","","abc","def","ghi","jkl","mno","pqrs",
                "tuv","wxyz"};
        for(int i=0;i<s[a].length();i++){
            if(c==s[a].charAt(i))return true;
        }
        return false;
    }

    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String s1="produces a printable string representation of a dictionary";
            String []s=in.nextLine().toLowerCase().split(" ");
            int n=Integer.parseInt(in.nextLine());
            int []nu=new int[100];
            int x=0;
            while(n>0){
                nu[x]=n%10;
                x++;
                n=n/10;
            }
            int []num=new int[x];
         //   System.out.println(num.length);
            for(int i=0;i<num.length;i++){
                num[i]=nu[x-i-1];
          //      System.out.println(num[i]);
            }

         //   System.out.println(num[0]+"--"+num[1]+"--"+num[2]);
            pan(s,num);

        }
    }
}
