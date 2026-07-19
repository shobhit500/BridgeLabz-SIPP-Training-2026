public class lowest_ancestor {

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

    static Node lowestCommonAncestor(Node root,int p,int q){

        while(root!=null){

            if(p<root.val && q<root.val)
                root=root.left;

            else if(p>root.val && q>root.val)
                root=root.right;

            else
                return root;
        }

        return null;
    }

    public static void main(String[] args){

        Node root=null;

        int arr[]={50,30,70,20,40,60,80};

        for(int x:arr)
            root=insert(root,x);

        Node ans=lowestCommonAncestor(root,20,40);

        System.out.println(ans.val);
    }
}