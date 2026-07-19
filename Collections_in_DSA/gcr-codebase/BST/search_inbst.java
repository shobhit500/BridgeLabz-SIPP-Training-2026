public class search_inbst {

    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    static boolean search(Node root, int target) {

        while (root != null) {

            if (root.val == target)
                return true;

            if (target < root.val)
                root = root.left;
            else
                root = root.right;
        }

        return false;
    }

    public static void main(String[] args) {

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        System.out.println(search(root, 60));
    }
}