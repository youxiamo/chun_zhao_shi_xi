package niu_ke_qiu_mo_kao;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/5/21 0021.
 */
public class max_fight_soldier {

    static void pan(int []num,int []qian){

        int []cha=new int[num.length];
        int max=num[0]+qian[0],xia=0;
        for(int i=0;i<num.length;i++){
            cha[i]=qian[i]-num[i];

            if(max==qian[i]+num[i]){if(num[i]>num[xia]){max=qian[i]+num[i];xia=i;}}
            else if(max<qian[i]+num[i]){max=qian[i]+num[i];xia=i;}
        }

        System.out.println(max+"---"+xia);
        int xx=max;

        for(int i=0;i<cha.length;i++){
            if(cha[i]>0)xx+=cha[i];

            if(i==xia)continue;

            if(cha[i]>0)max+=cha[i];

        }
        System.out.println(max+"---"+xx);
}


    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int num = in.nextInt();
            //  pan(num);
            int[] arr1 = new int[num];
            int[] arr2 = new int[num];
            for (int i = 0; i < num; i++) {
                arr1[i] = in.nextInt();
                arr2[i] = in.nextInt();
            }

            pan(arr1, arr2);
        }
    }
}
