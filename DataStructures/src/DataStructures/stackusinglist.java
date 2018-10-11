package DataStructures;

public class stackusinglist implements StackInterface {
   private node head;  
   private int top;
   
    public stackusinglist(){
            top = 0;
        }
    
    static class node {
        private int data; 
        private node next; 
        public node(int d) {
            data = d;
            next = null;
        }
    }
     @Override
    public boolean isFull() {
        return false;     //because we are using linked list and in this case
    }                    //their is no fixed number of elements.
    
   public void push(int d)
   {
       node ne = new node(d);
       ne.next= head;
       head = ne ;
       top++;
   }
   public int peek(){
    if(!isEmpty()){
        return head.data;
    }
       return -1;
   }
   @Override
   public int pop()
   {
       int d = head.data;
       head = head.next ;
       top--;
       return d;
   }
   public boolean isEmpty(){
    if(top < 0)
        return true;
    return false;
   }
   public static void main(String[] args){
       stackusinglist nn = new stackusinglist();
       
       nn.head = new node(10); 
       nn.push(20);
       System.out.println(nn.peek());
       nn.pop();
       System.out.println(nn.peek());
   }
}
