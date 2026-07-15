class Node {
    String functionName;
    Node next;

    Node(String functionName) {
        this.functionName = functionName;
        this.next = null;
    }
}

public class CallStack {

    Node top;

    // Constructor
    CallStack() {
        top = null;
    }

    // Push operation
    public void push(String functionName) {

        Node newNode = new Node(functionName);

        newNode.next = top;
        top = newNode;

        System.out.println(functionName + " called.");
    }

    // Pop operation
    public String pop() {

        if (isEmpty()) {
            System.out.println("No active function.");
            return null;
        }

        String function = top.functionName;
        top = top.next;

        return function;
    }

    // Peek operation
    public String peek() {

        if (isEmpty())
            return null;

        return top.functionName;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Display Call Stack
    public void display() {

        if (isEmpty()) {
            System.out.println("Call Stack is Empty");
            return;
        }

        Node temp = top;

        System.out.println("\nCurrent Call Stack:");

        while (temp != null) {
            System.out.println(temp.functionName);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        CallStack stack = new CallStack();

        stack.push("main()");
        stack.push("login()");
        stack.push("validateUser()");

        stack.display();

        System.out.println("\nCurrent Function : " + stack.peek());

        System.out.println("Function Returned : " + stack.pop());

        System.out.println("\nAfter Returning:");

        stack.display();
    }
}