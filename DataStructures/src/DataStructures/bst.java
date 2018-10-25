package DataStructures;
/* this code is implementation of generic binary search tree 
 * it sorts on the basis of student roll number where roll_number is a data menber of class student 
 */
class student implements Comparable<student> {

    int roll_number;
    String name;

    student(int r, String n) {
        roll_number = r;
        name = n;
    }

    @Override
    public String toString() {
        return "roll number : " + roll_number + " name : " + name;
    }

    @Override
    public int compareTo(student o) {
        return roll_number - o.roll_number;
    }
}

class binarysearch<T extends Comparable<T>> {

    static class node<T> {

        node left;
        node right;
        T key;

        public node(T item) {
            right = left = null;
            key = item;
        }
    }
    node root;

    void insert(T key) {
        root = insertr(root, key);
    }

    node insertr(node root, T key) {

        if (root == null) {
            root = new node(key);
            return root;
        }
        if (key.compareTo((T) root.key)< 0) {
            root.left = insertr(root.left, key);
        } else {
            root.right = insertr(root.right, key);
        }
        return root;
    }

    void inorder() {
        inorderRec(root);
    }

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

        binarysearch<student> obj = new binarysearch<>();
        obj.insert(s1);
        obj.insert(s2);
        obj.insert(s4);
        obj.insert(s3);

        obj.inorder();
    }
}
S
