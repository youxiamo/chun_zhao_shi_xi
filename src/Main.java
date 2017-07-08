import java.util.Scanner;

public class Main {

   static int pan(String s){
       if(s.length()<=1)return 1;
       char a;
       String temp=s;
       int i;
       int num=0;
       for(i=1;i<s.length();i++) {
           a = s.charAt(0);
           if(a==temp.charAt(0)&&temp.charAt(i-1)==s.charAt(i-1)) {


               if (temp.equals(s)) num++;

                   System.out.println(s);
           }
           s = s.substring(1, s.length());
           s = s + a;
       }
        return num;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String s=in.nextLine();
            int a=pan(s);
            System.out.println(a);
        }
    }

    public int MoreThanHalfNum_Solution(int [] array) {
                return -1;
    }
}
