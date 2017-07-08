package niu_ke_qiu_mo_kao;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/5/21 0021.
 */
public class find_num_of_wei {

    static void pan(int a){
        int count=0;
        while(a>=10){
            int n=a;
            int x=1;
            while(n>0){
                x=x*(n%10);
                n/=10;
            }
            a=x;
            count++;
        }

        System.out.print(count);
    }

    static void getArraySame(int []num){
        int max=num[0];
        for(int i=0;i<num.length;i++){
            if(num[i]>max)max=num[i];
        }
     //   System.out.println(max);
        for(int i=0;i<num.length;i++){
            if(max/num[i]==1){continue;}
            else if(max%num[i]!=0){System.out.println("NO");return;}
            else if((max/num[i])%2!=0){System.out.println("NO");return;}

        }
        System.out.println("YES");

    }

    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
        int num=in.nextInt();
      //  pan(num);
            int []arr=new int[num];
        for(int i=0;i<num;i++)
            arr[i]=in.nextInt();

        getArraySame(arr);
        }

      //  System.out.println("");
    }
}
