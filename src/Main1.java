import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Administrator on 2017/3/29 0029.
 */

public class Main1 {

    static  int pan(int price[],int gift){
            if(gift==0) return 0;
            else if(gift<0)return -1;
            for(int i=0;i<price.length;i++)
                if((gift-price[i])>=0) return pan(price,gift-price[i])+1;
            else continue;

        return -1;
    }


    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String s=in.nextLine();
            String []wu=s.split(",");
            int []price=new int[wu.length];
            for(int i=0;i<wu.length;i++){
                price[i]=Integer.parseInt(wu[i]);
            //    System.out.print(price[i]);
            }
            s=in.nextLine();
            int gift=Integer.parseInt(s);
        //    System.out.print(gift);
            if(gift<price[price.length-1])System.out.print(-1);
            System.out.print(pan(price,gift));

        }




    }
}
