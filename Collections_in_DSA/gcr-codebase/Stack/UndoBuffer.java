public class UndoBuffer {

    private String[] stack;
    private int top;

    // Constructor
    public UndoBuffer(int size) {
        stack = new String[size];
        top = -1;
    }

    // Push operation
    public void push(String edit) {

        if (isFull()) {
            System.out.println("Undo Buffer is Full!");
            return;
        }

        stack[++top] = edit;
        System.out.println(edit + " added to Undo Buffer");
    }

    // Pop operation
    public String pop() {

        if (isEmpty()) {
            System.out.println("Nothing to Undo");
            return null;
        }

        return stack[top--];
    }

    // Peek operation
    public String peek() {

        if (isEmpty()) {
            return null;
        }

        return stack[top];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if stack is full
    public boolean isFull() {
        return top == stack.length - 1;
    }

    // Display stack
    public void display() {

        if (isEmpty()) {
            System.out.println("Undo Buffer is Empty");
            return;
        }

        System.out.println("\nCurrent Undo Buffer:");

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {

        UndoBuffer undo = new UndoBuffer(5);

        undo.push("Type A");
        undo.push("Type B");
        undo.push("Delete A");

        undo.display();

        System.out.println("\nLatest Edit : " + undo.peek());

        System.out.println("Undo : " + undo.pop());

        System.out.println("\nAfter Undo:");

        undo.display();
    }
}