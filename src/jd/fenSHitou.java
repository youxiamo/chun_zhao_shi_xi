package jd;

        import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/7 0007.
 */
public class fenSHitou {

    static void pan(int n,int k){
        // 两种情况
        // 1开始
        // k 开始
        //  int []num=new int[n];

        int zong=n;
        int count=0;
        int count1 = 0;

        if(k==1){
            for(int i=0;i<n;i++){
                if(zong<=0)break;
                if(i%2!=0){zong-=2;if(zong>=0)count++;}
                else {zong -=1;if(zong>=0)count++;}

            }
            for(int i=0;i<n;i++){
                if(zong<=0)break;
                if(i%2==0){zong-=2;if(zong>=0)count1++;}
                else {zong -=1;if(zong>=0)count1++;}

            }

        }else {
            for (int i = 0; i < n; i++) {
                if (zong <= 0) break;
                if (i % 2 == 0) {
                    // num[i]=1;
                    zong -= 1;
                } else if (zong >= k) {
                    // num[i]=k;
                    zong -= k;
                    if(zong>=0)count++;
                }

            }

            zong = n;
            for (int i = 0; i < n; i++) {
                if (zong <= 0) break;
                if (i % 2 != 0) {

                    zong -= 1;
                } else if (zong >= k) {

                    zong -= k;
                    if(zong>=0)count1++;
                }

            }

        }
        if (count < count1) count = count1;
        System.out.println(count);


    }


    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String []s=in.nextLine().split(" ");
            int n=Integer.parseInt(s[0]);
            int k=Integer.parseInt(s[1]);
            pan(n,k);
        }
    }
}
