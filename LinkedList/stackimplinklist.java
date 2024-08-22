// correct code by own
public class stackimplinklist{
public static void main(String args[]){
    stack s=new stack();
        s.push(5);
        s.push(6);
        s.push(1);
        s.push(9);
        System.out.println(" ");
         s.display();
        System.out.println(" ");
        System.out.println("is stack empty "+s.isEmpty());  // return type

        System.out.println(" the top element is " +s.peek());    // return type
          s.pop();

          System.out.println("the top element after pop "+s.peek());
        System.out.println("new linkedlist ");        
          s.display();
  
}
}

class stack {
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}

    Node top;
     stack(){
        this.top=null;
    }
    public void push(int x)
    {
    Node newnode=new Node(x);
     
     //newnode.val=x;
     newnode.next=top;
     top=newnode;
}

public boolean isEmpty(){
    if(top==null){
        return true;
    }
    return false;
}

public int  peek(){
    if (top==null){
        System.out.println("underflow");
    return -1;
    }
    return top.val;
}

public void pop(){
if(top==null){
    System.out.println("underflow");
    
}
    top=top.next;   // write in this order only. if revered the meaning will be different and it will not work
}

public  void display(){
    if(top==null){
        System.out.println("underflow");
    }
    else{
        Node curr=top;
        while(curr!=null)
        {
            System.out.print(curr.val+"->");
         curr=curr.next;
        }
        System.out.print(" ");
        
        }
    }

}




