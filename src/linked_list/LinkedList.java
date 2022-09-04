package linked_list;

class Node<T> {
    T item;
    Node next;
    public Node(T item){
        this.item = item;
    }
    public Node(){

    }
}

public class LinkedList<T> {
    int length;
    Node first,last;

    public LinkedList(){
        this.length =0;
        this.first = this.last = null;
    }
    public boolean isEmpty(){
        return length == 0 ;
        // first == null
    }
    public void insertAtFirst(T element) {
        Node newNode = new Node<T>(element);
        if (isEmpty()){
            first = last = newNode;
            newNode.next = null;
        } else {
            newNode.next = first;
            first = newNode;
        }
        length++;
    }

    public void insertAtEnd(T element) {
        Node newNode = new Node<T>(element);
        if (isEmpty()){
            first = last = newNode;
            newNode.next = null;
        } else {
            last.next = newNode;
            newNode.next = null;
            last = newNode;
        }
        length++;
    }

    public void insertAtPos(int pos, T element){
        if (pos < 0 || pos > length){
            System.out.println("out of range");
            return;
        }

        Node newNode = new Node<T>(element);
        if (pos ==0){
            insertAtFirst(element);
        } else if (pos == length) {
            insertAtEnd(element);
        } else {
            Node current = first;
            for (int i = 1; i < pos; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        length++;
    }

    public void removeFirst(){
        if (isEmpty()){
            System.out.println("Empty list can not removed");
        }
        else if (length == 1){
            last = first = null;
            length--;
        } else {
            first = first.next;
            length--;
        }
    }

    public void removeEnd(){
        if (isEmpty()){
            System.out.println("Empty list can not removed");
        }
        else if (length == 1){
            last = first = null;
            length--;
        } else {
            Node prev = first;
            Node curr = first.next;
            while (curr != last){
                prev =curr;
                curr = curr.next;
            }
            prev.next = null;
            last = prev;
            length --;
        }
    }

    public void remove(T element){
        if (isEmpty()){
            System.out.println("Empty list can not removed");
            return;
        }
        Node curr,prev;
        if (first.item == element){
            first = first.next;
            length--;
            if (length == 0) {
                last = null;
            }
        } else {
            prev = first;
            curr = first.next;
            while (curr != null){
                if (curr.item == element){
                    break;
                }
                prev = curr;
                curr = curr.next;
            }
            if (curr == null){
                System.out.println("not found");
            } else {
                prev.next = curr.next;
                if (last == curr){
                    last = prev;

                }
                length--;
            }
        }
    }

    public void reverse(){
        Node prev,curr,next;
        prev = null;
        curr = first;
        next = curr.next;
        while (next != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        first = prev;
    }

    public int  search(T element){
        Node curr = first;
        int pos = 0;
        while (curr != null){
            if (curr.item == element){
                return pos;
            }
            curr = curr.next;
            pos += 1;

        }
        return  -1;
    }

    public void print(){
        Node current = first;
        while (current != null){
            System.out.println(current.item);
            current = current.next;
        }
    }


}


