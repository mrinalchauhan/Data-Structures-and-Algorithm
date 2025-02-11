public class sdf{
  public static void main(String args[]){
    LinkedList llist = new LinkedList();
  
    // create linked list 35->15->4->20
    llist.push(20);
    llist.push(4);
    llist.push(15);
    llist.push(35);
  
    System.out.println("Initial Linked List : ");
    llist.printList();
  

// DELETE KAISE HORHA HAI BHAI  (GFG CODE)

    // Delete 15 without sending head
    //int del=head.next.next;
    //llist.deleteNodeWithoutHead(del);
  
    
  
    // Print the final Linked List
    System.out.println("Final Linked List after deletion of 15 : ");
    llist.printList();
  }
}

class LinkedList{
class Node{
  int data;
  Node next;

  Node(int data){
    this.data=data;
  }
}
  

  static Node head;
  LinkedList(){
    this.head=null;
  }
  
  // Function to delete the node without head
  void deleteNodeWithoutHead(Node pos){
    if(pos == null) // If linked list is empty
      return;
    else{
      if(pos.next == null){
        System.out.println("This is last node, require head, can't be freed\n");
        return;
      }
    }
    // copy data of the next node to current node
    pos.data = pos.next.data;
  
    // perform conventional deletion
    pos.next = pos.next.next;
  }
  
  public void push(int new_data){
    // allocate node and put in the data
    Node new_node = new Node(new_data);
  
    // link the old list of the new node
    new_node.next = head;
  
    // move the head to point to the new node
    head = new_node;
  }
  
  public void printList(){
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    System.out.println("NULL\n");
  }
}