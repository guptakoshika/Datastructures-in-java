
package ;

import java.util.LinkedList;

public class graphs {
    private int vertices;
    private LinkedList<Integer> arr[] ;
   
    public graphs(int vertices){
        this.vertices = vertices;
        
        arr = new LinkedList[vertices] ;
        
        for(int i = 0 ; i < vertices ; i++)
            arr[i] = new LinkedList<>();
    }
    static void addEdge(graphs g , int src , int dest){
        
    }
}
