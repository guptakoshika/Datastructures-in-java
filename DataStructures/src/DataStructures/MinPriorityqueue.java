package DataStructures;

public class MinPriorityqueue implements PriotrityQueue{
    private final int arr[];
    private int n ;
    private final int capacity;
    
    public MinPriorityqueue(int capacity ){
        this.capacity = capacity;
        n = 0;
        arr = new int[capacity+1];
    }
    @Override
    public boolean isFull() {
        if(n == capacity)
            return true;
       return false;
    }

    @Override
    public boolean isEmpty() {
        if( n == 0)
            return true;
        return false;
    }

    @Override
    public void insert(int d) { 
        if(isFull())
            return ;
        arr[n+ 1] = d;
        int m = n + 1;
        while(m > 1)
        {
            if(arr[m] < arr[m / 2])
            {
                int temp = arr[ m ];
                arr[ m ] = arr[m / 2];
                arr[m / 2] = temp;
            }
            m = m / 2;
        }
       n++; 
    }

    @Override
    public int size() {
        System.out.println(arr[1]);
        return n;
    }

    @Override
    public int peek() {
        return arr[1];
    }
}
class pqMain{
       public static void main(String[] args){
           MinPriorityqueue pq = new MinPriorityqueue(10);
           pq.insert(10);
           pq.insert(5);
           pq.insert(9);
           pq.insert(2);
           System.out.println(pq.size());
       }
}
