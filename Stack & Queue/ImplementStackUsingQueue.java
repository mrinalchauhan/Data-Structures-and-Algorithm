import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack();
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.display(); // Display the stack contents
    }
}

class CustomStack {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public CustomStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    // Push element onto the stack
    void push(int data) {
        // Enqueue data into q2
        q2.add(data);

        // Transfer all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        // Swap references of q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Display the top element of the stack
    void display() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Top element: " + q1.peek());
    }
}
