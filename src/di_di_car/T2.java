package di_di_car;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/5/7 0007.
 */
public class T2 {
    static boolean [][]fu=null;
    static void pan(int a,int b,int [][]num){
        if(a==0 || b==0)return;

        int [][]nu=new int[a+2][b+2];
       fu=new boolean[a+2][b+2];
        for(int i=0;i<a+2;i++)
            for(int j=0;j<b+2;j++){
            if(i==0 || j==0){
                nu[i][j]=0;
            }else if(i==a+1 || j==b+1)nu[i][j]=0;
            else nu[i][j]=num[i-1][j-1];

            fu[i][j]=false;
            }
            int x=0;
        for(int i=1;i<a+1;i++)
            for(int j=1;j<b+1;j++) {
                if (!fu[i][j]) {
                    if(get(num,i,j))x++;
                }

            }

        System.out.println(x);
    }
    static boolean get(int [][]num,int i,int j){
        if(i<=0 || j<=0)return false;
        if(j>=num[0].length-1 || i>=num.length-1)return false;
        fu[i][j]=true;
        if(num[i-1][j]==1 && !fu[i-1][j]){fu[i-1][j]=true;//get(num,i-1,j);
        return true;}

        if(num[i+1][j]==1&&!fu[i+1][j]){fu[i+1][j]=true;//get(num,i+1,j);
        return true;}
        if(num[i][j-1]==1 && !fu[i][j-1]){fu[i][j-1]=true;//get(num,i,j-1);
            return true;}

        if(num[i][j+1] == 1 && !fu[i][j+1]){fu[i][j+1]=true;//get(num,i,j+1);
        return true;}


        if(num[i][j]==1)return true;
        return false;
    }

    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String []s1=in.nextLine().split(" ");
           int a=Integer.parseInt(s1[0]);
           int b=Integer.parseInt(s1[1]);
           int [][]num=new int[a][b];
           for(int i=0;i<a;i++){
               String s=in.nextLine();
               for(int j=0;j<b;j++){
                   if(s.charAt(j)=='1')num[i][j]=1;
                   else  num[i][j]=0;
               }
           }
           pan(a,b,num);


        }
    }
}
