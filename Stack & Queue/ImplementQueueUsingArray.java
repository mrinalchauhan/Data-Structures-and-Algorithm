// implememt queue using array
// T.C=O(1) for enqueue dequeue size top
//S.C=O(N) for whole queue

public class ImplementQueueUsingArray{
    public static void main(String args[]){
  Queue q=new Queue(5);
  System.out.println("initial size "+q.size());
  System.out.println("Elements pushed: ");
  q.enqueue(2);
  q.enqueue(5);
  q.enqueue(8);
  q.enqueue(9);
  q.enqueue(12);
  q.display( );
  System.out.println(" ");
  System.out.println("removing elements now");
  int pop=q.pop();
  System.out.println(pop);
  System.out.println("Now the size is "+q.size());
  System.out.println("Top element is "+q.top());
    }
}
class Queue{
   static int front,rear,capacity;
   static int queue[];
        Queue(int c){
            capacity=c;
            front=0;
            rear=0;
            queue=new int[c];
        }
        void enqueue(int data){
            
            if(rear!=capacity){
            
                queue[rear]=data;
                rear++;
            }
            else if(rear==capacity){
                System.out.println("queue is full");
            }
        }
        int pop(){
            int data=queue[front];
            front--;
            capacity--;
            return data;
            
        }
        int top(){
            return queue[front];
        }
        void display(){
            for(int i=front;i<rear;i++){
                System.out.print(queue[i]+"=> ");
            }
        }
        int size(){
            return capacity;
        }
}