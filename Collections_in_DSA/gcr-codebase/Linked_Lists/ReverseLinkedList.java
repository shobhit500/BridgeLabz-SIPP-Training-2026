class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {

    // Reverse the linked list
    static Node reverse(Node head) {

        Node prev = null;
        Node curr = head;

        while (curr != null) {

            Node next = curr.next; // Save next node

            curr.next = prev;      // Reverse the link

            prev = curr;           // Move prev forward

            curr = next;           // Move curr forward
        }

        return prev;
    }

    // Display the linked list
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

        System.out.println("Original Browser History:");
        display(head);

        head = reverse(head);

        System.out.println("\nReversed Browser History:");
        display(head);
    }
}