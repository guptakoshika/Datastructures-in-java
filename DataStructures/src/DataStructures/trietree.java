package DataStructures;

import java.util.*;

public class trietree {
    static final int size = 26;
   
    static class node {
        private boolean isEndofWord;
        node[] child = new node[size];
        public node(){
            isEndofWord = false;
            for(int i = 0 ; i < 26 ; i++)
                child[i]= null;
        }
    }
    
  static node root;
  static void insertnode(String str){ 
        int index; 
       
        node pCrawl = root; 
       
        for (int level = 0; level <  str.length(); level++) 
        { 
            index = str.charAt(level) - 'a'; 
            if (pCrawl.child[index] == null) 
                pCrawl.child[index] = new node(); 
       
            pCrawl = pCrawl.child[index]; 
        } 
        pCrawl.isEndofWord = true; 
    } 
  
  static boolean search(String key) 
    {  
        int index; 
        node pCrawl = root; 
       
        for (int level = 0; level < key.length(); level++) 
        { 
            index = key.charAt(level) - 'a'; 
       
            if (pCrawl.child[index] == null) 
                return false; 
       
            pCrawl = pCrawl.child[index]; 
        } 
       
        return (pCrawl != null && pCrawl.isEndofWord); 
    } 
}

class array{
    int index;
    int count;
}
class sortbyc implements Comparator<array> 
{ 
    @Override
    public int compare(array a, array b) 
    { 
        return a.count - b.count; 
    } 
}