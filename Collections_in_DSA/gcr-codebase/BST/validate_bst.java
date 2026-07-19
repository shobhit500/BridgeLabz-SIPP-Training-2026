public class validate_bst {

    static class Node {

        int val;
        Node left,right;

        Node(int val){
            this.val=val;
        }
    }

    static boolean validate(Node root,long min,long max){

        if(root==null)
            return true;

        if(root.val<=min || root.val>=max)
            return false;

        return validate(root.left,min,root.val)
                &&
                validate(root.right,root.val,max);
    }

    static boolean isValidBST(Node root){

        return validate(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    public static void main(String[] args){

        Node root=new Node(50);

        root.left=new Node(30);
        root.right=new Node(70);

        root.left.left=new Node(20);
        root.left.right=new Node(40);

        root.right.left=new Node(60);
        root.right.right=new Node(80);

        System.out.println(isValidBST(root));
    }
}