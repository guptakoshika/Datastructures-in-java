
package DataStructures;

import java.util.Iterator;
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
    void addEdge(int src , int dest){
        arr[src].add(dest);
        arr[dest].add(src);
    }
    void dfs(int vertex) 
    {  
        boolean visited[] = new boolean[vertices] ;
        visited[vertex] = true; 
        System.out.print(vertex + " "); 
  
        Iterator<Integer> i = arr[vertex].listIterator(); 
        while (i.hasNext()) 
        { 
            int n = i.next(); 
            if (!visited[n]) 
                dfs(n); 
        } 
    } 
}
public class graphs{
   
     public static void main(String args[]) 
    {
        int vertices = 5; 
        graph g = new graph(vertices); 
         g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3);
        
        
        g.dfs(2);
    } 
} 
