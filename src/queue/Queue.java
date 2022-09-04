package queue;

class Node <T>{
    T item;
    Node next;
}

public class Queue<T> {
    int rear,front;
    T[] arr;
    int maxSize;
    int length;

    public Queue(int size){
        if (size < 0){
            maxSize = 10;
        }
        else {
            maxSize = size;
        }
        length =0;
        front = 0;
        rear = maxSize - 1;
        arr =(T[]) new Object [maxSize];
    }
    boolean isFull(){
        return length == maxSize;
    }
    boolean isEmpty(){
        return  length == 0;
    }
    public void enqueue(T element){
        if (isFull()){
            System.out.println("Queue is Full");
        }
        else {
            rear = (rear + 1) % maxSize;
            arr[rear] = element;
            length++;
        }
    }
    public void dequeue(){
        if (isEmpty()){
            System.out.println("Queue is empty");
        } else {
            front =(front + 1) % maxSize;

            length--;
        }
    }
    public T getFront(){
        return arr[front];
    }
    public T getRear(){
        return  arr[rear];
    }
    public void print(){
        for (int i = 0; i != rear ; i = (i + 1) % maxSize) {
            System.out.println(arr[i]);
        }
        System.out.println(arr[rear]);
    }
    public int search(T element){
        int pos = -1;
        if (isEmpty()){
            System.out.println("Queue is empty");
        } else {
            for (int i = 0; i != rear; i=(i+1) % maxSize) {
                if(arr[i]==element){
                    return i;

                }
            }
            if (pos == -1){
                if (arr[rear] == element){
                    pos =rear;
                    return pos;
                }
            }
        }
        return pos;
    }
}
