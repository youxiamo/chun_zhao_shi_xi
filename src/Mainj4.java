import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/30 0030.
 */
public class Mainj4 {
    static int pan(int []A,int []B,int a,int b){
        int num=0;
        for(int i=0;i<A.length;i++){
            if(A[i]>=a&&B[i]>=b)num++;
        }
        return num;
    }

    static int []xu(int []a){
        for(int i=0;i<a.length;i++)
            for(int j=i;j<a.length-1;j++)
                if(a[j]<a[j+1]){
            int temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
                }
        return a;
    }
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.nextLine();
            String[] s1 = s.split(" ");
            int n = Integer.parseInt(s1[0]);
            int q = Integer.parseInt(s1[1]);
            s=in.nextLine();
            String []sA=s.split(" ");
            s=in.nextLine();
            String []sB=s.split(" ");

            int []A=new int[n];
            int []B=new int[n];
            for(int i=0;i<n;i++){
                A[i]=Integer.parseInt(sA[i]);
                B[i]=Integer.parseInt(sB[i]);
            }
            int a,b;

            for(int i=0;i<q;i++){
                a=in.nextInt();
                b=in.nextInt();
                int num=0;
                for(int j=0;j<A.length;j++){
                    if(A[j]>=a&&B[j]>=b)num++;
                }
                System.out.println(num);
            }

        }
    }
}
