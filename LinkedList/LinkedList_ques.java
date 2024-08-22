public class LinkedList_ques {
    static Node head; // Head of the list

    // Node class
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Reverse the linked list
    public Node reverse(Node node) {
        Node prev = null;
        Node curr = node;
        Node next = null;
        
        while (curr != null) {
            next = curr.next; // Save next node
            curr.next = prev; // Reverse current node's pointer
            prev = curr;      // Move prev and curr one step forward
            curr = next;
        }
        
        return prev; // New head of the reversed list
    }

    // Print the linked list
    public void printList(Node node) {
        if (node == null) {
            System.out.println("The list is empty.");
            return;
        }
        
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println(); // Move to the next line after printing the list
    }

    public static void main(String[] args) {
        LinkedList_ques list = new LinkedList_ques();
        
        // Initialize the linked list
        head = new Node(2);
        head.next = new Node(5);
        head.next.next = new Node(6);
        
        // Print the original list
        System.out.println("Original List:");
        list.printList(head);
        
        // Reverse the list
        head = list.reverse(head);
        
        // Print the reversed list
        System.out.println("Reversed List:");
        list.printList(head);
    }
}
