package stack;

class Node<T> {
    T item;
    Node next;
}

public class LinkedStack <T>{
    private Node top, current;
    public LinkedStack(){
        top = null;
    }
    public void push(T item){
        if(item == null){
            System.out.print("Error");
        } else {
            Node newItem =new Node();
            newItem.item = item;
            newItem.next = top;
            top = newItem;
        }
    }

    public boolean isEmpty(){
        return top == null;
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        } else {
            Node temp  = top;
            top = top.next;
            temp.next = null;
        }
    }

    public Object getTop(){
        return top.item;
    }

    public void print(){
        current = top;
        while (current != null){
            System.out.println(current.item);
            current = current.next;
        }

    }
}

