import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Administrator on 2017/3/30 0030.
 */
public class MainJ3 {
    static int mm;
    static void dra(char a,int level,int fl){
        String s;
        if(fl==0)s="";
        else s="|";
        if(a=='['){
             s +="+";
            for(int i=0;i<level*2-1;i++)s+="-";
            s+="+";
        }else{
            s +="+";
            for(int i=0;i<level*2-1;i++)s+="-";
            s+="+";
        }
        if (fl!=0)s+="|";
        System.out.println(s);
    }
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.nextLine();
            int num=0;
            int max=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='[')num++;
                    else if(num>max){max=num;num=0;}

            }
            Stack<Character> st=new Stack<Character>();
            for(int i=s.length();i>=0;i--){
                st.push(s.charAt(i));
            }
            int level=max;
            int kong=0;
            while(st.empty()){
                char a=st.pop();
                if(a=='['){dra(a,level,level==max?0:1);level--;kong=0;}
                else {dra(a,level,level==max?0:1);level++;
                if(kong==0)System.out.println("");
                }

            }
        }
    }
}
