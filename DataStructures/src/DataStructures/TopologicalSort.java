package DataStructures;

import java.util.*;

class GraphView{
    
    int v ;
    int indegree[];
    boolean visited[] ;
    LinkedList<Integer> adj[];
    
    GraphView(int v ){
        this.v = v;
        indegree = new int[v];
        adj = new LinkedList[v];
        visited = new boolean[v];
         for (int i=0; i<v; ++i){
             adj[i] = new LinkedList();
             indegree[i] = 0;
             visited[i] = false;
         }
    }
 
    public void find_indegree(){
        for(int i = 0 ; i < v ; i++)
        {
            Iterator itr = adj[i].iterator();
            while(itr.hasNext())
            {
                int x = (Integer) itr.next();
                indegree[x]++;
            }
        }
    }
 
    public void print_indegree(){
        for(int i = 0 ; i < v ; i++)
        {
            System.out.println(i + " " + indegree[i]);
        }
    }
    public void insertEdge(int src , int dest){
        adj[src].add(dest);
    }
    
    public int findZeroIndegree(){
        for(int i = 1 ; i < v ; i++)
        {
            if(indegree[i] == 0 && visited[i] == false)
            {
                 visited[i] = true;
                 return i;
            }           
        }
        return -1;
    }
    
    public void bfs(){
        int index = findZeroIndegree();
        Queue<Integer> q = new LinkedList<>();
        q.add(index);
        
        while(!q.isEmpty())
        {
            int x = q.remove();
            if(x!=-1)
            {
               System.out.println(x);
            Iterator i = adj[x].iterator();
            while(i.hasNext())
            {
                int n =(Integer) i.next();
                indegree[n]--;
            }
            int a = findZeroIndegree();
            q.add(a); 
            }  
        }
    }
}
 
public class TopologicalSort {
    public static void main(String[] args){
       GraphView f = new GraphView(6); 
       f.insertEdge(1, 2);
       f.insertEdge(1, 3);
       f.insertEdge(2, 3);
       f.insertEdge(2, 4);
       f.insertEdge(3, 4);
       f.insertEdge(3, 5);
       f.find_indegree();
       f.bfs();
    }
}
