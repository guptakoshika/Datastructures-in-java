package DataStructures;

 public class stack {
       private int top;           //for indexing of the array
       private static final int s = 100;
       private int a[] = new int[s];
       
     public stack(){
         top = -1;
     }
     
     private boolean isempty(){
         if( top == -1)
             return true;
         return false;
     }
     
     private boolean isfull(){
         if(top == s)
             return true ;
         return false;
     }
     
     private void push( int data){
         if(!isfull()){
             top ++;
             a[top] = data ;
         }
     } 
     
     private int pop(){
         if(!isempty()){
            int d = a[top];
              top--;
              return d; 
         }
         return -1;
     }
     
     private int peek(){
         return a[top];
     }
     
     public static void main(String[] args){
         stack s = new stack();    //stack class object 
         
         // calling above functions
         s.push(10);
         s.push(20);
         System.out.println(s.peek());
         System.out.println(s.pop());
         System.out.println(s.isfull());
         System.out.println(s.isempty());
     }
}
