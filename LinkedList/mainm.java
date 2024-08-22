// correct run code by chatgbt
// merge two linked list into a single linkedlist
public class mainm {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.insert(1);
        list1.insert(3);
        list1.insert(5);

        LinkedList list2 = new LinkedList();
        list2.insert(2);
        list2.insert(4);
        list2.insert(6);

        System.out.println("List 1:");
        list1.printList();

        System.out.println("List 2:");
        list2.printList();

        LinkedList mer = LinkedList.mergeLists(list1, list2);

        System.out.println("Merged List:");
        mer.printList();
    }
}


class LinkedList {
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

    Node head;

    LinkedList() {
        this.head = null;
    }

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    static LinkedList mergeLists(LinkedList list1, LinkedList list2){
        LinkedList mergedList = new LinkedList();
        Node current1 = list1.head;
        Node current2 = list2.head;
     // merge according to alternate position
       while (current1 != null && current2 != null) {

            mergedList.insert(current1.data);
            mergedList.insert(current2.data);
            current1 = current1.next;
            current2 = current2.next;




    // merge according to value of list
   /*           if (current1.data <= current2.data) {
                mergedList.insert(current1.data);
                current1 = current1.next;
            } else {
                mergedList.insert(current2.data);
                current2 = current2.next;
            }
         
        */    
        
        // not necessary part
        while (current1 != null) {
            mergedList.insert(current1.data);
            current1 = current1.next;
        }

        while (current2 != null) {
            mergedList.insert(current2.data);
            current2 = current2.next;
        }   
       }
        return mergedList;
    
}
}



