package DataStructures;

import java.util.*;

enum Color {    
    WHITE, GREY, BLACK;
}

class Dfs {

    private int v, parent[];
    private Color id[];
    private ArrayList<ArrayList<Integer>> arr;
    
    public Dfs(int v) {
        this.v = v;
        this.id = new Color[v];
        this.parent = new int[v];
        arr = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            arr.add(new ArrayList<>());
        }
    }
    
    private boolean dfsFuncRec(int start, int p) {
        id[start] = Color.GREY;
        parent[start] = p;
        
        for (int i = 0; i < v; i++) {
            
            Iterator itr = arr.get(i).iterator();
            
            while (itr.hasNext()) {
                int x = (Integer) itr.next();
                
                if (id[x] == Color.WHITE) {
                    dfsFuncRec(x, start);
                }
                if (id[x] == Color.GREY && parent[x] != start) {
                    System.out.println(start + " " + x);
                    return true;
                }
            }
        }
        id[start] = Color.BLACK;
        return false;
    }

    public void insertEdge(int src, int dest) {
        arr.get(src).add(dest);
    }

    public boolean dfsFunc(int start) {
        return dfsFuncRec(start, -1);
    }
}

public class Dfs_traversal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices in Graph");
        int nv = sc.nextInt();
        Dfs d = new Dfs(nv);
        d.insertEdge(0, 1);
        d.insertEdge(1, 2);
        d.insertEdge(2, 0);
        System.out.println(d.dfsFunc(0));
    }
}
