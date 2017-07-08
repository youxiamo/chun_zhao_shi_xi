package tengxun;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/2 0002.
 */
public class max_mian {

    public static int countArea(int[] A, int n) {
        // write code here
        int max=0;
    int num;
        for(int i=0;i<n;i++){
        int j=i-1;
        num=0;
        while(j>=0&&A[j]>=A[i])j--;

        num=j+1;
        //     System.out.println("jj"+num);
        j=i+1;
        while(j<A.length&&A[j]>A[i])j++;
        num=j-num;

        //    System.out.println(num);
        if(num*A[i]>max)max=num*A[i];
    }
        return max;
}
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String []s=in.nextLine().split(",");
            int []a=new int[s.length];
            for(int i=0;i<s.length;i++){
                a[i]=Integer.parseInt(s[i]);
            }
            System.out.print(countArea(a,a.length));
        }
    }
}
