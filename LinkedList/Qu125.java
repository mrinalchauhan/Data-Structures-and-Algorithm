public class Qu125 {

  // Node class
  class Node {
      int data;
      Node next;

      Node(int data) {
          this.data = data;
          this.next = null;
      }
  }

  // Head of the linked list
  static Node head = null;

  // LinkedList class
  public class LL {

      // Insert a new node at the beginning
      public void insert(int data) {
          Node newN = new Node(data);
          if (head == null) {
              head = newN;
          } else {
              newN.next = head;
              head = newN;
          }
      }

      // Detect a loop in the linked list
      public Node detectLoop() {
          Node fast = head;
          Node slow = head;

          while (fast != null && fast.next != null) {
              fast = fast.next.next;
              slow = slow.next;

              if (fast == slow) {  // Loop detected
                  System.out.println("Cycle exists");

                  // To find the start of the loop
                  slow = head;
                  while (slow != fast) {
                      slow = slow.next;
                      fast = fast.next;
                  }
                  return slow;  // The starting point of the loop
              }
          }
          return null;  // No loop
      }
  }

  // Main method
  public static void main(String[] args) {
      Qu125 outer = new Qu125(); // To access non-static inner classes
      LL list = outer.new LL();

      list.insert(4);
      list.insert(5);
      list.insert(8);
      list.insert(3);

      // Create a loop manually for testing
      Node temp = head;
      while (temp.next != null)
          temp = temp.next;

      // Making the last node point to the second node to create a loop
      temp.next = head.next;

      // Detect loop
      Node start = list.detectLoop();
      if (start == null) {
          System.out.println("No loop");
      } else {
          System.out.println("Cycle exists at node with data: " + start.data);
      }
  }
}
