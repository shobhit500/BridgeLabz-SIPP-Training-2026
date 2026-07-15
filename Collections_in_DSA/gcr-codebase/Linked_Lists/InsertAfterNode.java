class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertAfterNode {

    // Insert a new node after the given current node
    static void insertAfter(Node current, int value) {

        // If current node is null, insertion is not possible
        if (current == null) {
            System.out.println("Current node cannot be null.");
            return;
        }

        // Create new node
        Node newNode = new Node(value);

        // New node points to the next node
        newNode.next = current.next;

        // Current node points to new node
        current.next = newNode;
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

        // Creating linked list
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Original Playlist:");
        display(head);

        // Current playing track = 20
        Node current = head.next;

        insertAfter(current, 25);

        System.out.println("\nPlaylist After Insertion:");
        display(head);
    }
}