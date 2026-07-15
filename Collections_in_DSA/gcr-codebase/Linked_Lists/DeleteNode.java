class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteNode {

    // Delete node with given value
    static Node deleteNode(Node head, int value) {

        // Case 1: Empty list
        if (head == null) {
            return null;
        }

        // Case 2: Delete first node
        if (head.data == value) {
            return head.next;
        }

        Node prev = head;
        Node curr = head.next;

        // Search for the node
        while (curr != null && curr.data != value) {
            prev = curr;
            curr = curr.next;
        }

        // Node found
        if (curr != null) {
            prev.next = curr.next;
        }

        return head;
    }

    // Display linked list
    static void display(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        // Create Linked List
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println("Original Task Queue:");
        display(head);

        head = deleteNode(head, 30);

        System.out.println("\nAfter Deleting Task 30:");
        display(head);
    }
}