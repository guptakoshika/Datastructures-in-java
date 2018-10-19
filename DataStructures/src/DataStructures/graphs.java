
package DataStructures;

// graph using Adjency list 
import java.util.LinkedList;

class graph {
    private int vertices;
    private LinkedList<Integer> arr[] ;
   
    public graph(int vertices){
        this.vertices = vertices;
        
        arr = new LinkedList[vertices] ;
        
        for(int i = 0 ; i < vertices ; i++)
            arr[i] = new LinkedList<>();
    }
    void addEdge(graph g , int src , int dest){
        arr[src].add(dest);
        arr[dest].add(src);
    }
}
public class graphs{
    
     public static void main(String args[]) 
    {
        int vertices = 5; 
        graph g = new graph(vertices); 
        g.addEdge(g, 0, 1); 
        g.addEdge(g, 0, 4); 
        g.addEdge(g, 1, 2); 
        g.addEdge(g, 1, 3); 
        g.addEdge(g, 1, 4); 
        g.addEdge(g, 2, 3); 
        g.addEdge(g, 3, 4); 
    } 
} 
