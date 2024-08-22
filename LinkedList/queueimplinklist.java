// correct code by own
// implement queue using linkedlist

public class queueimplinklist {
    public static void main(String args[]){
        queue q=new queue();
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(5);
        q.enqueue(8);
        q.enqueue(9);
        if(q.front!=null){
         System.out.print((q.front).val+"->");
         System.out.print((q.front.next).val+"->");
         System.out.print((q.front.next.next).val+"->");
         System.out.print((q.front.next.next.next).val+"->");
         System.out.print((q.front.next.next.next.next).val);
        }

}
}
class queue{
    class Node{
        int val;
        Node next;
    
    Node(int val){
        this.val=val;
    }
}
Node front;
Node rear;


    queue(){
        this.front=front;
        this.rear=rear;
         
    }


    public void enqueue(int x){
        Node temp=new Node(x);
        if(rear==null){
           rear=front=temp;
        }
        rear.next=temp;
        rear=temp;
    }

    public void dequeue(){
         if(front==null){
            System.out.println("queue is Empty");
         }
         front=front.next.next;

    }
     public void display(Node head){
        Node temp= head;
         if(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
         }
         System.out.println(" ");

     }
}