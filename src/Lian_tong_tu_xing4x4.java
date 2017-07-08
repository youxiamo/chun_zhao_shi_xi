import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/1 0001.
 */
public class Lian_tong_tu_xing4x4 {

    static char [][]tu={
        {'0','1','2','3'},{'4','5','6','7'},{'8','9','a','b'},{'c','d','e','f'}
    };

    static boolean pan(char []c){
        int x,y,x1,y1;
        for(int i=1;i<c.length;i++){
            x=c[i]/4;
            y=c[i]%4;
            x1=c[i-1]/4;
            y1=c[i-1]%4;
            if(x==x1){
                if(Math.abs(y-y1)!=1)return false;
            }else if(y==y1){
                if(Math.abs(x-x1)!=1)return false;
            }return false;

        }
        return true;
    }
    static int wei(char a){
        if(a<='9')return a-'0';
        else return a-'a'+10;
    }

    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String s=in.nextLine();
            s=s.replace(" ","");
            char []c=s.toCharArray();
            /*Arrays.sort(c,new Comparable<Character>{

                public int compare(Character a, Character b){
                    return -1;
                }
            }
            );
            */
            Arrays.sort(c);
            System.out.println(c);
                System.out.print(pan(c));
            //System.out.print(wei('a'));
        }
    }
}
