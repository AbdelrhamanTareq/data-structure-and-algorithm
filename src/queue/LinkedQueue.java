package queue;

public class LinkedQueue<T> {
    Node front,rear;
    int length;

    public LinkedQueue(){
        this.rear = null;
        this.front = null;
        this.length = 0;
    }

   public boolean isEmpty(){
        /*
        if(rear == null){

            return true;
        }
        else {
            return false;
        }

         */
        return length == 0 ;
    }

    public void enqueue(T element){
        if (isEmpty()){
            front = new Node();
            front.item = element;
            front.next = null;
            rear = front;
            length++;
        } else {
            Node newNode = new Node();
            newNode.item = element;
            newNode.next = null;
            rear.next = newNode;
            rear = newNode;
            length++;
        }
    }

    public void dequeue(){
        if (isEmpty()){
            System.out.println("Queue is empty");
        }else {
            Node temp = front;
            if (front == rear) { // || (lenghth == 1)
                front = null;
                rear = null;
                length--;
            } else {
                front = front.next;
                temp.next = null;
                length --;
            }
        }
    }

    public T getFront(){
        if(isEmpty()) {
            return null;

        }
        else {
            return (T) front.item;
        }

    }

    public T getRear(){

        if (isEmpty()) {
            return null;
        }
        return (T) rear.item;
    }

    public void clear(){
        front = null;
        rear = null;
        length =0;
    }

    public  int getSize(){
        return  length;
    }
    public void print(){
        Node current = front;
        if (current == null){
            System.out.println("Queue is empty");
        }
        while (current != null){
            System.out.println(current.item);
            current = current.next;
        }

    }


}
