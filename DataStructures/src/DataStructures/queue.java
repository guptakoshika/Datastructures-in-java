package DataStructures;

public class queue implements queueinterface {
    
    private static final int size = 10000;
    private int top;
    private int end;
    private int[] a = new int[size];
    
    public queue(){
        top = 0 ;
        end = 0;
    }
    @Override
    public int peek(){
        return a[top];
    }
     @Override
     public boolean isEmpty(){
         if(end == 0 )
             return true;
         return false;
     }   
      @Override
      public boolean isFull(){
          if(end == size)
              return true;
          return false;
      }
       @Override
      public boolean enqueue(int d){
          if(!isFull()){
            a[end] = d;
             end ++;
             return true;
          } 
         return false;
      }
       @Override
      public boolean dequeue(){
          if(!isEmpty()){
               top++;
               return true;
          }
          return false;
      }
}
class Main{
    public static void main(String[] args){
        queue obj = new queue();
        
        //assiging values in the queue.
        System.out.println("element inserted?: " + obj.enqueue(10) );
        System.out.println("element inserted?: " + obj.enqueue(20));
        System.out.println("element inserted?: " + obj.enqueue(30));
        
        //removing the top elemnt from the queue.
        System.out.println("element removed?: " + obj.dequeue());
        
        //printing the top most element
        System.out.println("top elemnet of the queue is "+ obj.peek());
        
        //check whether the queue is empty or not
        System.out.println("queue is empty?: " + 
                
                obj.isEmpty());
    }
}
