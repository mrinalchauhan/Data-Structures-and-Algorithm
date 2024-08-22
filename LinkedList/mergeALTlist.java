 // CORRECT CODE BY OWN 
 // MERGE TWO LINKED ALTERNATIVELY INTO A SINGLE LINKED LIST

public class mergeALTlist {
    public static void main(String args[]){
        linklist list1=new linklist();
        linklist list2=new linklist();
        list1.insert(1);
        list1.insert(3);
        list1.insert(5);
        list1.insert(7);

        list1.display();

        list2.insert(2);
        list2.insert(4);
        list2.insert(6);
        list2.insert(8);

        list2.display();


   
    linklist me=linklist.merge(list1, list2);

     me.display();
        
    }
}
class linklist{

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;

        }
    }
Node head;
/*linklist(Node head){
    this.head=null;   */


    public void push(int x){
        Node newN= new Node(x);
        newN=head.next;
        head=newN;

    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ->");
            temp=temp.next;

        }
        System.out.println("null");
    }
    public void insert(int x){
       
        Node newN=new Node(x);
        if(head==null){
          head=newN;  
        }
        else
        {    
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newN;
    }
    }
    public static linklist merge(linklist list1,linklist list2){
        linklist m=new linklist();
        Node curr1=list1.head;
        Node curr2=list2.head;


          // NOT WORKING IN GENRAL CASE
         // merging according to value in the 
        // linklist small one first then larger values
         // only working when list1= 1 3 5 
         //                     list2= 2 4 6     output 1 2 3 4 5 6

          /*  while(curr1 !=null && curr2!=null){
            if(curr1.data<curr2.data){
                m.insert(curr1.data);
                curr1=curr1.next;

            }
            else{
                m.insert(curr2.data);
                curr2=curr2.next;
            }

           
            
        }   */

       while(curr1!=null && curr2!=null){
            m.insert(curr1.data);
            m.insert(curr2.data);
            curr1=curr1.next;
            curr2=curr2.next;


        }   
            return m;
          
    }
}
    

    
