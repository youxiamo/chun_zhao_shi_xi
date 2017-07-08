import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/29 0029.
 */
public class Main2 {

    static int pan(int num,int []price,int []wight,int max){


        int [][]c=new int[num+1][max+1];
        for(int j=0;j<max+1;j++)
       {
            for(int i=0;i<num+1;i++){

                if (i == 0 || j == 0) c[i][j] = 0;
                else {
                    if (wight[i - 1] <= j) {

                            c[i][j] =Math.max( c[i-1][j],c[i - 1][j - wight[i - 1]] + price[i - 1]);
                        } else c[i][j] = c[i - 1][j];

                }
            }
        }


        return c[num][max];
    }
    static int[] zheng(int []a){
        for(int i=0;i<a.length;i++)
            for(int j=i;j<a.length-1;j++)
            if(a[j]<a[j+1]){int temp=a[j];a[j]=a[j+1];a[j+1]=temp;
            }

            return a;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

            String s=in.nextLine();
            int num=Integer.parseInt(s);
            if(num==0)System.out.println(0);
            else {
                s = in.nextLine();
                String[] temp = s.split(" ");
                int[] price = new int[temp.length];
                for (int i = 0; i < num; i++) {
                    price[i] = Integer.parseInt(temp[i]);
                }
                s = in.nextLine();
                String[] temp1 = s.split(" ");
                int[] weight = new int[temp1.length];
                for (int i = 0; i < num; i++) {
                    weight[i] = Integer.parseInt(temp1[i]);
                }
                int max = Integer.parseInt(in.nextLine());



                System.out.println(pan(num, price, weight, max));
            }

    }
}
