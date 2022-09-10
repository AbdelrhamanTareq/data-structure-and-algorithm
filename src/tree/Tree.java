package tree;


import queue.LinkedQueue;
import queue.Queue;

class Node<T> {
    Node left;
    Node right;
    T value;
    Node(T value){
        this.value = value;
        left = right = null;
    }
}



public class Tree<T> {


    //TreeNode root;

    Node root;

    private Node insertRecursive(Node current, T value){
        if (current == null){
            return new Node<>(value);
        }
        if ((int)value < (int)current.value) {
            current.left = insertRecursive(current.left,value);
        } else if ((int)value > (int)current.value) {
            current.right = insertRecursive(current.right,value);
        }
        return current;
    }

    public void insert(T value) {
        root = insertRecursive(root,value);
    }

    // Search for element in tree

    private boolean containsNodeRecursive(Node current,T value) {
        if (current == null) {
            return false;
        }
        else if (value == current.value) {
            return true;
        }

        return (int) value < (int) current.value
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }

    public boolean search(T value) {
        return containsNodeRecursive(root,value);
    }

    private Node deleteRecusive(Node current,T value){
        if (current == null){
            return null;
        }
        if (value == current.value){
            //  node has no children
            if(current.left == null && current.right == null){
                return null;
            }
            // node has exactly one child
            if (current.right == null) {
                return current.left;
            }
            if (current.left == null) {
                return current.right;
            }
            // node has two children

            // find smallest value in right subtree (or max value in left subtree)
            T smallestValue = findSmallestValue(root.right);
            // swap current node with smallest value
            current.value = smallestValue;
            // remove node
            current.right = deleteRecusive(current.right,smallestValue);
            return current;


        }
        if ((int)value < (int)current.value) {
            current.left = deleteRecusive(current.left,value);
        }

        current.right = deleteRecusive(current.right,value);
        return current;
    }

    public void delete(T value) {
         deleteRecusive(root,value);
    }

    // find smallest value

    private T findSmallestValue(Node root){
        return root.left == null ? (T) root.value : findSmallestValue(root.left);
    }
    public T findMinuiumValue(){
        return findSmallestValue(root);
    }

    private T findMaxValue(Node root){
        return root.right == null ? (T) root.value : findMaxValue(root.right);
    }
    public T findMaxmiumValue(){
        return findMaxValue(root);
    }

    // find max value


    // Traversing the Tree

    //Depth-First Search
    private void traverseInOrder(Node root){
        if (root != null){
            traverseInOrder(root.left);
            System.out.println(root.value);
            traverseInOrder(root.right);
        }
    }
    public void traverseInOrder(){
        traverseInOrder(root) ;
    }
    private void traversePreOrder(Node root){
        if (root != null){
            System.out.println(root.value);
            traverseInOrder(root.left);
            traverseInOrder(root.right);
        }
    }
    public void traversePreOrder(){
        traversePreOrder(root);
    }
    private void traversePostOrder(Node root){
        if (root != null){
            traverseInOrder(root.left);
            traverseInOrder(root.right);
            System.out.println(root.value);
        }
    }
    public void traversePostOrder(){
        traversePostOrder(root);
    }

    // Breadth-First Search

    public void traversLevelOrder(){
        if (root == null){
            return;
        }
        LinkedQueue<Node> nodes = new LinkedQueue<>();
        nodes.enqueue(root);

        while (!nodes.isEmpty()){
            Node node = nodes.getFront();
            System.out.println(node.value);
            nodes.dequeue();

            if (node.left != null){
                nodes.enqueue(node.left);
            }
            if (node.right != null){
                nodes.enqueue(node.right);
            }
        }
    }






}
