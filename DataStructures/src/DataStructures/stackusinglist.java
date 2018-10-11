package DataStructures;

public class stackusinglist {
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
   public void pop(){
       head = head.next ;
       top--;
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
