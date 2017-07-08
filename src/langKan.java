/**
 * Created by Administrator on 2017/4/1 0001.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class langKan {
    public static void main(String[] args) {
        int[][] map = { { 0, 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9, 10, 11 }, { 12, 13, 14, 15 } };
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] strs = str.split("\\s+");
            int n = strs.length;
            int num[] = new int[n];
            Queue<Integer> q = new LinkedList<Integer>();
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                num[i] = Integer.parseInt(strs[i], 16);
                list.add(num[i]);
            }

            q.offer(num[0]);
            list.remove(Integer.valueOf(num[0]));
            int i = 1;
            while (!q.isEmpty()) {
                //System.out.println(q);
                int temp = q.poll();
                if (list.contains(temp + 1)) {
                    q.offer(temp + 1);
                    list.remove(Integer.valueOf(temp + 1));
                }
                if (list.contains(temp - 1)) {
                    q.offer(temp - 1);
                    list.remove(Integer.valueOf(temp - 1));
                }
                if (list.contains(temp + 4)) {
                    q.offer(temp + 4);
                    list.remove(Integer.valueOf(temp + 4));
                }
                if (list.contains(temp - 4)) {
                    q.offer(temp - 4);
                    list.remove(Integer.valueOf(temp - 4));
                }
            }
            if (list.isEmpty())
                System.out.println("pong");
            else
                System.out.println("pang");
        }
    }
}