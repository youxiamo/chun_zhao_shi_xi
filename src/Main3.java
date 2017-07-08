import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/30 0030.
 */
public class Main3 {

    static int pan(int []A,int n,int m){
        int num=0;

        int p=0;
        for(int i=0;i<A.length;i++)
            for(int j=i;j<A.length;j++)
            {

                if((A[i]^A[j])>m)p++;
            }
        return p;
    }

    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int []A=new int[n];
        for(int i=0;i<n;i++)
            A[i]=in.nextInt();

        System.out.print(pan(A,n,m));
    }
}
