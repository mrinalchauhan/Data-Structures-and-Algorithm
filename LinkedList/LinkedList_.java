
    
class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
    }
}

class LinkedListStack {
    private ListNode top;

    public LinkedListStack() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        int poppedValue = top.value;
        top = top.next;
        return poppedValue;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        return top.value;
    }
}

public class LinkedList_{
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: Is stack empty? true

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: Is stack empty? false

        System.out.println("Top element: " + stack.peek()); // Output: Top element: 30

        System.out.println("Popped element: " + stack.pop()); // Output: Popped element: 30

        System.out.println("Top element: " + stack.peek()); // Output: Top element: 20

        stack.push(40);

        System.out.println("Top element: " + stack.peek()); // Output: Top element: 40

        System.out.println("Popped element: " + stack.pop()); // Output: Popped element: 40

        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: Is stack empty? false
    }
}

