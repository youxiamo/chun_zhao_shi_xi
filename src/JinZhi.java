import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/31 0031.
 */

public class JinZhi {

    static void pan(int a){
        long num=0;
        for(int i=2;i<a;i++){
            int temp=a;
            long cout=0;
            while(temp>=i){
                cout+=temp%i;
                temp/=i;
            }
            cout+=temp;
            num+=cout;
            // System.out.println(cout);

        }long s=maxCommonDivisor(num,a-2);
        System.out.println((num/s)+"/"+(a-2)/s);
    }
    public static long maxCommonDivisor(long x,long y){
        if(y == 0) return x;
        else return maxCommonDivisor(y,x%y);
    }

    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){

            }


        System.out.println("-");
    }
}
