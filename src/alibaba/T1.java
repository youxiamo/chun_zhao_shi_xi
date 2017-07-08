package alibaba;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/26 0026.
 */
//IU语23成为而为挂号费
    // zhe shi ni
public class T1 {

      public static void pan(String s1,String p){

     //   System.out.println(s1+"\\\\"+p);

           if(isMatch(s1,0,p,0))
        System.out.println(1);
           else  System.out.println(0);



    }



    static boolean isMatch(String s, int sIdx, String p, int pIdx) {
        // 同时到各自的末尾

        if (s.length() == sIdx && p.length() == pIdx) {
            return true;
        }

        else if (s.length() != sIdx && p.length() == pIdx) {
            return false;
        }
        if(s.charAt(sIdx)=='-'||p.charAt(pIdx)=='-'){sIdx++;pIdx++;return isMatch(s,sIdx,p,pIdx);}
        else {

            if (pIdx < p.length()  && p.charAt(pIdx ) == '*') {


                    // 忽略*
                    return isMatch(s, sIdx+1, p, pIdx);

            }

            // 匹配一个字符
            if (sIdx < s.length() && (s.charAt(sIdx) == p.charAt(pIdx) || p.charAt(pIdx) == '?')) {
                return isMatch(s, sIdx + 1, p, pIdx + 1);
            }
        }
        return false;
    }

    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String s=in.nextLine();
            String p=in.nextLine();
            pan(s,p);
        }
    }

}
