public class mergesorted {
  public static void main(String[] args) {
      // Create the first linked list
      Node l1 = new Node(1);
      l1.next = new Node(3);
      l1.next.next = new Node(5);

      // Create the second linked list
      Node l2 = new Node(2);
      l2.next = new Node(4);
      l2.next.next = new Node(6);

      // Merge the two linked lists
      Node mergedList = mergee(l1, l2);

      // Output the merged list
      while (mergedList != null) {
          System.out.print(mergedList.data + " ");
          mergedList = mergedList.next;
      }
  }

  // Node class
  static class Node {
      Node next;
      int data;

      Node(int data) {
          this.data = data;
      }
  }

  // LinkedList class (if needed for future use)
  static class LinkedList {
      Node head;

      public void insert(int x) {
          Node newN = new Node(x);
          if (head == null) {
              head = newN;
          } else {
              Node curr = head;
              while (curr.next != null) {
                  curr = curr.next;
              }
              curr.next = newN;
          }
      }

      public void display() {
          Node curr = head;
          while (curr != null) {
              System.out.print(curr.data + "->");
              curr = curr.next;
          }
          System.out.println("null");
      }

      public static LinkedList merge(LinkedList list1, LinkedList list2) {
          Node curr1 = list1.head;
          Node curr2 = list2.head;
          LinkedList ll = new LinkedList();

          while (curr1 != null && curr2 != null) {
              if (curr1.data < curr2.data) {
                  ll.insert(curr1.data);
                  curr1 = curr1.next;
              } else {
                  ll.insert(curr2.data);
                  curr2 = curr2.next;
              }
          }
          return ll;
      }
  }

  // Merge two sorted linked lists
  public static Node mergee(Node l1, Node l2) {
      Node dummy = new Node(-1);
      Node curr = dummy;

      while (l1 != null && l2 != null) {
          if (l1.data < l2.data) {
              curr.next = l1;
              l1 = l1.next;
          } else {
              curr.next = l2;
              l2 = l2.next;
          }
          curr = curr.next;
      }

      // If one list is exhausted, attach the remaining elements of the other list
      if (l1 != null) {
          curr.next = l1;
      } else {
          curr.next = l2;
      }

      return dummy.next; // Return the head of the merged list
  }
}
