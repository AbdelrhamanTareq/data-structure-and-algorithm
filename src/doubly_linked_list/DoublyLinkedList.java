package doubly_linked_list;

class DoublyNode<T>{
    T item;
    DoublyNode next,prev;
}

public class DoublyLinkedList<T> {



    int length;
    DoublyNode first,last;

    public DoublyLinkedList(){
        this.length = 0;
        this.first = this.last = null;
    }

    public void insertFirst(T element){
        DoublyNode newNode = new DoublyNode();
        newNode.item = element;

        if (length == 0){
            first = last = newNode;
            newNode.next = newNode.prev = null;
        }else {
            newNode.next = first;
            newNode.prev = null;
            first.prev = newNode;
            first = newNode;
        }
        length++;
    }

    public void insertLast(T element){
        DoublyNode newNode = new DoublyNode();
        newNode.item = element;

        if (length == 0){
            first = last = newNode;
            newNode.next = newNode.prev = null;
        }else {
            newNode.next = null;
            newNode.prev = last;
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public void insertAt(int pos, T element){
        if (pos < 0 || pos > length){
            System.out.println("out of range");
            return;
        }
        DoublyNode newNode = new DoublyNode();
        newNode.item = element;
        if (pos == 0){
            insertFirst(element);
        }
        else if (pos == length){
            insertLast(element);
        }
        else {
            DoublyNode curr = first;
            for (int i = 1; i < pos; i++){
                curr = curr.next;
            }
            newNode.next = curr.next;
            newNode.prev = curr;
            curr.next.prev = newNode;
            curr.next = newNode;

            length ++;
        }


    }

    public void removeFirst(){
        if (length == 0){
            System.out.println("Empty list");
        } else if (length == 1) {
            first = last = null;
        } else {
            first = first.next;
            first.prev = null;
        }
        length--;
    }

    public void removeLast(){
        if (length == 0){
            System.out.println("Empty list");
        } else if (length == 1) {
            first = last = null;
        } else {
            last = last.prev;
            last.next = null;
        }
        length--;
    }

    public void remove(T element){
        if (length == 0){
            System.out.println("Empty list");
        } else if (first.item == element){
            removeFirst();
        } else {
            DoublyNode curr = first.next;
            while (curr != null && curr.item != element){
                curr = curr.next;
            }
            if (curr == null){
                System.out.println("Element not found");

            } else if (curr.next == null   ) {
                // last element
                removeLast();
            } else {
                curr.prev.next = curr.next;
                curr.next.prev = curr.prev;
            }
            length--;
        }
    }

    public void print(){
        if (length == 0){
            System.out.println("list is empty");
            return;
        }
        DoublyNode curr = first;
        while (curr != null){
            System.out.println(curr.item);
            curr = curr.next;
        }
    }

    public void reverse(){
        if (length == 0){
            System.out.println("list is empty");
            return;
        }
        DoublyNode curr = last;
        while (curr != null){
            System.out.println(curr.item);
            curr = curr.prev;
        }
    }

}
