// correct code by own 
// remove duplicate in the linklist


public class removeduplicate {
    public static void main(String args[]){
        linkedlist ll=new linkedlist();
        ll.insert(1);
        ll.insert(2);
        
        ll.insert(3);
        ll.insert(2);
        ll.insert(4);
        ll.insert(1);
        ll.display();

        ll.duplicate();
        ll.display();
    }
}
class linkedlist{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        Node head;
        public void insert(int val){
        Node newN= new Node(val);
        if(head==null){
            head=newN;
        }
        else{
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=newN;
        }

    }

    public void display(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" -> ");
              curr=curr.next;
        }
    System.out.println("null");
    }

    
    
        public void duplicate(){
        Node curr=head;                                         
        while(curr!=null){                                     
            Node runner=curr;
            while(runner.next!=null){
            if(curr.data==runner.next.data){
                runner.next=runner.next.next;
            }
            else{
            runner=runner.next;
            }
          }
    
            curr=curr.next;
        }
             
        }
    }
    
