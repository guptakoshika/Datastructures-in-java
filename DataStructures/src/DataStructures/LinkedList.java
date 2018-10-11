package DataStructures;
   
class LinkedList 
{ 
    private node head;  
  
    static class node {
        private int data; 
        private node next; 
        public node(int d) {
            data = d;
            next = null;
        }
    }
    /*
    AddAtLast() is use to create a new node at the end of the list.
    */
    private void AddAtLast(){
        node n = new node(10);
        head.next = n;
    }
    /*
    this fuunction will create a new node and point the list at the end of the node created.
    */
    private void AddAtBegining(int d ){
        node n = new node(d);
        n.next = head;
        head = n;
    }
    /* 
     this function will search for a node whose data user what to search and 
    will return its index if not found then will return -1.
    */
    private int searchNode(int d){
        int count = 0 ;
        node h = head ;
        while(h!=null)
        {
            if(h.data == d)
                return count ;
            else
                count ++;
            h = h.next;
        }
        return -1;
    }
    /*
      this function is used to delete the first occurence of node by the data 
    */
      private void DeletebyData(int key){
          node h = head;
          node p = null;
          while(h != null && h.data == key)
          {
              head = head.next ;
              return ;
          }
          while(h!=null && h.data!=key){
              p = h;
              h = h.next;
          }
          if(h== null ) return ;
          
          p.next = h.next;
      }
    /*
      this function is used to print the list from the begining to the last node.
    */
    private void printlist(){
        node h = head ;
        while(h != null){
            System.out.println(h.data);
            h = h.next;
        }
    }
    /* 
    this function print the list in reverse order i.e. from last to first ( using reccursion)
    */
    private void printinRev(node head){
       if(head == null)
           return ;
       printinRev(head.next);
        System.out.println(head.data);
    }
    /*
      this function will return the first element of the list
    */
    private int peek(){
        return head.data;
    }
    //main function 
    public static void main(String[] args){
     LinkedList l = new LinkedList();
     
     l.head = new node(12);
     
    //calling above functions 
     l.AddAtLast();
     l.AddAtBegining(10);
     l.printlist();
     
    System.out.println(l.searchNode(12));
    l.DeletebyData(10);
    l.printlist();
    l.printinRev(l.head);
    
    System.out.println(l.peek());
    }
}
