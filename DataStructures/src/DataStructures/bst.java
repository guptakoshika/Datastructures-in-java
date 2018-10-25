package DataStructures;

class student implements Comparable<student>{

    int roll_number;
    String name;

    student(int r, String n ) {
        roll_number = r;
        name = n;
    }

    @Override
    public String toString() {
        return "roll number : " + roll_number + " name : " + name ;
    }

    @Override
    public int compareTo(student obj) {
        return roll_number - obj.roll_number;
    }
}

class binarysearch {

    static class node {

        node left;
        node right;
        student key;

        public node(student item) {
            right = left = null;
            key = item;
        }

    }
    node root;

    void insert(student key) {
        root = insertr(root, key);
    }

    node insertr(node root, student key) {

        if (root == null) {
            root = new node(key);
            return root;
        }
        if (key.compareTo(root.key) < 0 ) {
            root.left = insertr(root.left, key);
        } else {
            root.right = insertr(root.right, key);
        }

        return root;
    }

    void inorder() {
        // System.out.println("root is: " + root.right.key.roll_number);
        inorderRec(root);
    }

    // A utility function to do inorder traversal of BST 
    void inorderRec(node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }
}

public class bst {

    public static void main(String[] args) {
        student s1 = new student(10, "koshika");
        student s2 = new student(4, "abc");
        student s3 = new student(5, "xyz");
        student s4 = new student(11, "mno");

        binarysearch obj = new binarysearch();
        obj.insert(s1);
        obj.insert(s2);
        obj.insert(s4);
        obj.insert(s3);

        obj.inorder();
    }
}
