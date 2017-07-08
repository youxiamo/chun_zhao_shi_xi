package alibaba;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Administrator on 2017/4/26 0026.
 */
public class T2 {
    static void pan(String s1){
        String []s=s1.split(" ");

        int coun=0;
        Stack<Integer> stack=new Stack<Integer>();
        for(int i=0;i<s.length;i++){
            if(s[i].equals("^")){
                if(!stack.empty()){int a=stack.pop();a++;stack.push(a);}
                else{System.out.println(-1);return;}

                continue;
            }
            if(s[i].equals("+")){
                    if(stack.empty()){System.out.println(-1);return;}
                    else {
                        int a1=stack.pop();
                        if(stack.empty()){System.out.println(-1);return;}
                        else {
                            coun--;
                            int b1=stack.pop();
                            stack.push(a1+b1);
                        }
                }
                continue;
            }
            if(s[i].equals("*")){
                if(stack.empty()){System.out.println(-1);return;}
                else {
                    int a1=stack.pop();
                    if(stack.empty()){System.out.println(-1);return;}
                    else {
                        coun--;
                        int b1=stack.pop();
                        stack.push(a1*b1);
                    }
                }
                continue;
            }


            int num=Integer.parseInt(s[i]);
            if(coun>16){System.out.println(-2);return;}
            stack.push(num);
            coun++;
        }

        System.out.println(stack.pop());
    }
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String s=in.nextLine();

            pan(s);
        }
    }
}
