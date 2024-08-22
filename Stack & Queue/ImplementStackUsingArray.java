//T.C=O(N)
//S.C=O(N)   for whole stack
//for push pop peek O(1) each 

public class ImplementStackUsingArray {
    public static void main(String args[]){
    Stack s=new Stack();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    System.out.println("Displaying stack :");
    s.display();
    System.out.println("The top element is "+s.peek());
    System.out.println("Now removing the top element "+s.pop());
    System.out.println("now the top element is "+s.peek());
    System.out.println("is the stack empty ? "+s.isEmpty());
    }
}
class Stack{
    
    int maxsize=10000;
    int arr[]=new int[maxsize-1];
    int top=-1;

    public void push(int val){
        if(top==maxsize){
            System.out.println("stack is full");

        }
        top++;
        arr[top]=val;
       
     }
        public boolean isEmpty(){
            if(top==-1){
            return true;  // stack is empty
            }
            return false; 
        }
        public int pop(){
            if(isEmpty()){
                System.out.println("STACK IS EMPTY..NOTHING TO POP OUT OF STACK");
            }
            int val=arr[top];
            top--;
            return val;
        }
        public int peek(){
           return arr[top];
        }
        public void display(){
            for(int i=top;i>-1;i--){
                System.out.print(arr[i]+" ");
            }
            System.out.println(" ");
        }
    }

