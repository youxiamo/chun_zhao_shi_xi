package goWhere;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/1 0001.
 */
 class Node<E>{
    E data;
    Node left;
    Node right;
}
public class getQue {



    static int []L;
    static int []V;
    static int []R;
    static Queue<Node<Integer>> queue;

    public static Node<Integer> solvePostOrder(int preStart,int inStart,int length){
        if (length<=0)
            return null;
        int v = L[preStart];
        Node<Integer> root =new Node<>();
        root.data=v;
        int len = getLength(inStart,length,v);//获取左子树的长度len，则右子树的长度为length-len-1

        root.left=solvePostOrder(preStart+1,inStart,len);//递归解决左子树
        root.right=solvePostOrder(preStart+len+1,inStart+len+1,length-len-1);//右子树
        //System.out.print(v+" ");//打印根节点
        return root;
    }


    public static int getLength(int start,int length,int v){//根据中间节点，求左子树的长度
        for (int i = start,count = 0; count<length; i++,count++){
            if (V[i] == v)
                return count;
        }
        return 0;
    }
    public static void find(Node<Integer> root){

    }

    public static void main(String []atgs){
        Scanner in=new Scanner(System.in);

        while(in.hasNext()){
            int n=Integer.parseInt(in.nextLine());
            String []s1=in.nextLine().split(" ");
            String []s2=in.nextLine().split(" ");
            V=new int[n];
            L=new int[n];
            queue=new LinkedList<Node<Integer>>();
            for(int i=0;i<n;i++){
                L[i]=Integer.parseInt(s1[i]);
                V[i]=Integer.parseInt(s2[i]);
            }

Node<Integer> node=solvePostOrder(0,0,L.length);

            queue.add(node);
            while(!queue.isEmpty()){
                Node<Integer> te=queue.poll();
            if(te!=null) {
                System.out.print(te.data + " ");
                queue.add(te.left);
                queue.add(te.right);
            }
            }
          //  System.out.println("");
        }

    }
}
