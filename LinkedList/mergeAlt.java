// not correct
// merge two  linked list into one linked
//gfg code ...output not coming
// Class to represent a linked list
class LinkList {
    Node head;  // Head of the list

    // Node class
    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Inserts a new Node at the front of the list
    void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    // Merges the second list into the first list at alternate positions
    public void merge(LinkList q) {
        Node p_curr = head;
        Node q_curr = q.head;
        Node p_next, q_next;

        // While there are available positions in both lists
        while (p_curr != null && q_curr != null) {
            // Save next pointers
            p_next = p_curr.next;
            q_next = q_curr.next;

            // Insert q_curr after p_curr
            p_curr.next = q_curr;
            q_curr.next = p_next;

            // Move to the next nodes
            p_curr = p_next;
            q_curr = q_next;
        }

        // If there are remaining nodes in the second list, they should remain
        q.head = q_curr;
    }

    // Function to print linked list
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

// Driver class to test the functionality
public class mergeAlt {
    public static void main(String[] args) {
        LinkList llist1 = new LinkList();
        LinkList llist2 = new LinkList();
        
        // Adding nodes to the first linked list
        llist1.push(3);
        llist1.push(2);
        llist1.push(1);

        System.out.println("First Linked List:");
        llist1.printList();

        // Adding nodes to the second linked list
        llist2.push(8);
        llist2.push(7);
        llist2.push(6);
        llist2.push(5);
        llist2.push(4);

        System.out.println("Second Linked List:");
        llist2.printList();

        // Merging second linked list into the first
        llist1.merge(llist2);

        System.out.println("Modified first linked list:");
        llist1.printList();

        System.out.println("Modified second linked list:");
        llist2.printList();
    }
}
