import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/30 0030.
 */
public class Mainj1 {
    static void pan(int []num,int n){
        if(n<=2){System.out.println(-1+" "+-1);return;}
        int start=0;
        int lang=1;
        int max=1;
        int flag=0;
        for(int i=0;i<n-1;i++){
                if (num[i] <num[i +1]&&flag==0) lang++;
                else if(lang>1&&num[i]>num[i+1]&&flag==0){flag=1;lang++;}
                else if(lang>1&&num[i]>num[i+1]&&flag==1){lang++;}
                else if(flag==1&&lang>0&&lang>max){start=i;max=lang;lang=1;flag=0;}

        }
        if(lang>max&&flag==1&&num[n-2]<num[n-1]){start=n;max=lang;}
       // System.out.println(max);
        if(max>1) {
            System.out.println((start  - max) + " " + start );
        }else System.out.println(-1+" "+-1);
    }

    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()) {
            int n=Integer.parseInt(in.nextLine());
            String s=in.nextLine();
            String []s1=s.split(" ");
            int []num=new int[n];
            for(int i=0;i<n;i++)
                num[i]=Integer.parseInt(s1[i]);
            pan(num,n);
        }

        }
}
