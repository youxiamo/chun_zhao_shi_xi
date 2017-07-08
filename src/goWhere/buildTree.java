package goWhere;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/1 0001.
 */
public class buildTree {
    static Queue<Integer> queue=new LinkedList<Integer>();
    static boolean []use;
    static void pan(int qian[],int zhong[],int n,int end){
        queue.add(qian[n]);
        int a=find(zhong,qian[n]);
        use[a]=false;
        if(use[a-1])pan(qian,zhong,n,a-1);

        if(use[n+1])pan(qian,zhong,a+1,end);
    }
    static int find(int a[],int n){
        for(int i=0;i<a.length;i++){
            if(a[i]==n)return i;
        }
        return -1;
    }
    public static void main(String []atgs){
        Scanner in=new Scanner(System.in);

        while(in.hasNext()){
            int n=Integer.parseInt(in.nextLine());
            String []s1=in.nextLine().split(" ");
            String []s2=in.nextLine().split(" ");
            int []qian=new int[n];
            int []zhong=new int[n];
            use=new boolean[qian.length];
            for(int i=0;i<n;i++){
                qian[i]=Integer.parseInt(s1[i]);
                zhong[i]=Integer.parseInt(s2[i]);
                use[i]=true;

            }

            pan(qian,zhong,0,qian.length);
            while(!queue.isEmpty()){
                System.out.print(queue.poll());
            }
        }

    }
}
