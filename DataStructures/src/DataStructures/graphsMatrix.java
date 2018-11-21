// graphs using adjanceny matrix!!
package DataStructures;

import java.util.*;

class Graphs{
   private int v ;
   private boolean [][] arr ;
    public Graphs(int nv){
        v = nv ;
       arr = new boolean[v][v];
    }
    public boolean insertedge(int v1 , int v2 ){
        if( v1 < v && v2 < v){
            arr[v1][v2] = true ;
            return true;
        }
          return false;
    }
    public boolean findedge(int v1 , int v2){
       return arr[v1][v2];
    }
    public void deleteEdge(int v1 , int v2)
    {
        arr[v1][v2] = false;
    }
}
public class graphsMatrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices in graph");
        int nv = sc.nextInt();
        Graphs g = new Graphs(nv);
    }
}