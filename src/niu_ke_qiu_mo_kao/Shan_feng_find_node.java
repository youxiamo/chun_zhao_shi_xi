package niu_ke_qiu_mo_kao;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/5/21 0021.
 */
public class Shan_feng_find_node {


    static void pan(int []num){

        int count=0;
        int i=1;
        for(i=1;i<num.length-1;i++){
            if(num[i-1]<=num[i]&&num[i]>num[i+1]){count++;continue;}
            if(num[i-1]<num[i]&&num[i]>=num[i+1]){count++;continue;}
        }

        System.out.println(count);
    }

    static void pan_ingrone(int []num){

        int count=0;
        int flag=0;
        int max=0;
        for(int i=1;i<num.length;i++){
            if(num[i]>num[i-1]){
                if(flag==0){count++;flag=1;continue;}
                if(flag==1){
                    count++;continue;
                }else if (flag==-1){
                    if(num[i+1]<num[i-1]&&(num[i-1]-num[i+1])>1){
                        i++;count++;continue;}
                    else {flag=0;if(max<count)max=count; count=0;}
                }
            }else if(num[i]<num[i-1]){
                if(flag==0){count++;flag=-1;continue;}
                if(flag==-1){
                    count++;continue;
                }else if(flag==1){
                    if(num[i+1]>num[i-1]&&(num[i+1]-num[i-1])>1){
                        i++;count++;continue;
                    }else {flag=0;if(max<count)max=count; count=0;}
                }
            }
        }

        System.out.println(max);
    }
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int num=in.nextInt();
            //  pan(num);
            int []arr=new int[num];
            for(int i=0;i<num;i++)
                arr[i]=in.nextInt();

            pan_ingrone(arr);
        }

        //  System.out.println("");
    }

    
}
