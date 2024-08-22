
    class Node{
        int data;
        Node next;


        Node(int data){
            this.data=data;
            this.next=null;

        }
    }

public class Qu126 {
    // mergelist

public  Node mergelist(Node A,Node B){
            if( A == null)
            return B;

            if(B== null)
            return A;

            if(A.data<B.data){
            A.next=mergelist(A.next, B);
            return A;

            }
            else{
                //(B.data<A.data)
            B.next=mergelist(A,B.next);
             return B;
            }
        }
}



 
    
  class  merge{

    Node head;
public void addtolast(Node node){
//Node node=new Node(data);

if(head==null){
head=node;
}
else{
Node temp=head;
while(temp!=null){
  temp=temp.next;
 temp.next=node;
}
}
 }
        
public void printlist()
{     
    /*        if(head==null)
        {
            head= null;
        }  */
        Node temp=head;
        if (temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
        }
        System.out.println("-");   

        }

public static void main(String args[]){
    merge l1=new merge();
    merge l2=new merge();
 
    l1.addtolast(new Node(5));
    l1.addtolast(new Node(6));
    l1.addtolast(new Node(7));
    l2.addtolast(new Node(3));
    l2.addtolast(new Node(8));
    l2.addtolast(new Node(9));


    l1.head=new Qu126().mergelist(l1.head,l2.head);
    
    l1.printlist();


}

  }

    

