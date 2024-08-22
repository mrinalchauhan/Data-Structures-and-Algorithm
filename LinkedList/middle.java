
    class ListNode {
        int value;
        ListNode next;
    
        ListNode(int value) {
            this.value = value;
        }
    }
    
    public class middle {
        public static int findMiddleElement(ListNode head) {
            if (head == null) {
                return -1; // Handle the case where the list is empty or null.
            }
    
            ListNode slowPointer = head;
            ListNode fastPointer = head;
    
            while (fastPointer != null && fastPointer.next != null) {
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next.next;
            }
    
            return slowPointer.value;
        }
    
        public static void main(String[] args) {
            // Example usage:
            // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);
            head.next.next.next.next.next = new ListNode(6);
            //head.next.next.next.next.next.next = new ListNode(7);
            int middleElement = findMiddleElement(head);

            
            System.out.println("Middle element: " + middleElement); // Output: Middle element: 3
        }
    }
    

