public class doublyLL {
    public static void main(String args[]){
        doubly dd=new doubly();
        
    }
}
class doubly{
    class Node{
    Node next;
    Node prev;
    int data;
    
    Node(int data){
        this.data=data;   
    }
}
Node head;
  
    public void printForward(){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data+" ->");
            curr=curr.next;
        }
    }
}