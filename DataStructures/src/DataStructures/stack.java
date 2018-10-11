package DataStructures;

 public class stack implements StackInterface{
       private int top;           //for indexing of the array
       private static final int s = 100;
       private int a[] = new int[s];
       
     public stack(){
         top = -1;
     }
     
     public boolean isEmpty(){
         if( top == -1)
             return true;
         return false;
     }
     
     public boolean isFull(){
         if(top == s)
             return true ;
         return false;
     }
     
     public void push( int data){
         if(!isFull()){
             top ++;
             a[top] = data ;
         }
     } 
     
     public int pop(){
         if(!isEmpty()){
            int d = a[top];
              top--;
              return d; 
         }
         return -1;
     }
     
     public int peek(){
         return a[top];
     }
     
     public static void main(String[] args){
         stack s = new stack();    //stack class object 
         
         // calling above functions
         s.push(10);
         s.push(20);
         System.out.println(s.peek());
         System.out.println(s.pop());
         System.out.println(s.isFull());
         System.out.println(s.isEmpty());
     }
}
