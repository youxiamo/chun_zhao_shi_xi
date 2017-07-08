package alibaba;

/**
 * Created by Administrator on 2017/4/25 0025.
 */
public class Test {
    public static void main(String []args){
        int a=1;
        for(int i=0;i<2014;i++){
            a=(a*7)%100;
        }
        System.out.print(a);
    }
}
