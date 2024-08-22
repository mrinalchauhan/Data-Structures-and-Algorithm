// CODE BY OWN ..NEED TO CORREC    T->GFG RECOMENDED
// DELETE NODE WITHOUT HEAD IN LINKLIST
//T.C O(1)
//S.C O(1)
import java.util.LinkedList;
public class delWithoutHead {
    public static void main(String args[]){
      

      Linkedlist ll=new Linkedlist();
        ll.insert(2);
        ll.insert(3);
        ll.insert(5);
        ll.insert(9);

       // DELETE KAISE HORHA H ?
       //Node del = llist.head.next;
  
        // Function call
       // llist.delete(del);
      //Node ans=head.next.next;
      ll.printlist(); 
    
    }
}
class Linkedlist{
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    Node head;
    Linkedlist(){
        this.head=null;
    }
    public void insert(int val) {
        Node newNode=new Node(val);
           
        newNode.next=head;
        head=newNode;
        //newNode=newNode.next;
        }
    
    public void delete(Node pos){
        if(pos==null){
            System.out.println("null");

        }
        Node nextnode=pos.next;
        pos.val=nextnode.val;
        pos.next=nextnode.next;

    }
    
    public  void printlist(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.val+" -> ");
             curr=curr.next;
             
         }  
         System.out.println("null");
    }
}
