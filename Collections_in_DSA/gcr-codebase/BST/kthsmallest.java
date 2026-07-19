import java.util.*;

public class kthsmallest {

    static class Node{

        int val;
        Node left,right;

        Node(int val){
            this.val=val;
        }
    }

    static Node insert(Node root,int val){

        if(root==null)
            return new Node(val);

        if(val<root.val)
            root.left=insert(root.left,val);

        else if(val>root.val)
            root.right=insert(root.right,val);

        return root;
    }

    static int kthSmallest(Node root,int k){

        Stack<Node> stack=new Stack<>();

        Node current=root;

        int count=0;

        while(current!=null || !stack.isEmpty()){

            while(current!=null){
                stack.push(current);
                current=current.left;
            }

            current=stack.pop();

            count++;

            if(count==k)
                return current.val;

            current=current.right;
        }

        return -1;
    }

    public static void main(String[] args){

        Node root=null;

        int arr[]={50,30,70,20,40,60,80};

        for(int x:arr)
            root=insert(root,x);

        System.out.println(kthSmallest(root,3));
    }
}