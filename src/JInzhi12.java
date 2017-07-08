/**
 * Created by Administrator on 2017/3/31 0031.
 */

import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.HashSet;
        import java.util.Scanner;

public class JInzhi12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int num = in.nextInt();
            int sum = 0;
            for(int i = 2; i <= num-1; i++){
                sum += getNRadix(num,i);
            }
            int maxCommonDivisor = maxCommonDivisor(sum,num-2);
            System.out.println(sum/maxCommonDivisor+"/"+(num-2)/maxCommonDivisor);
        }
    }

    public static int getNRadix(int num,int N){
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(num != 0){
            list.add(num%N);
            num = num/N;
        }
        int sum = 0;
        for(int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        return sum;
    }

    public static int maxCommonDivisor(int x,int y){
        if(y == 0) return x;
        else return maxCommonDivisor(y,x%y);

    }



}
