package array;

public class Array<T> {
    T[] arr;
    int maxSize,length;
    public Array(int size){
        if (size < 0){
            maxSize = 5;
        }
        else {
            maxSize = size;
        }
        length =0;
        arr =(T[]) new Object[maxSize];
    }
    public boolean isEmpty(){
        return length ==0;
    }
    public boolean isFull(){
        return  length == maxSize;
    }
    public int getSize(){
        return length;
    }
    public void print(){
        for (int i = 0; i < length; i++) {
            System.out.println(arr[i]);
        }
    }
    public void insert(T element ){
        if (isFull()){
            System.out.println("Array is full");
        } else if (isEmpty()){
            arr[0] = element;
            length++;
        } else {
            for (int i = length; i >= 1 ; i--) {
                arr[i] = arr[i-1];
            }
            arr[0] = element;
            length++;
        }
    }
    public void  insertAtPos(T element, int pos){
        if (isFull()){
            System.out.println("List is full");
        }
        else if (pos < 0 || pos > length){
            System.out.println("Out of range");
        }
        else {
            for (int i = length; i > pos ; i--) {
                arr[i] = arr[i-1];
            }
            arr[pos] = element;
            length++;
        }
    }

    public void removeAtPos(int pos){
        if (isEmpty()){
            System.out.println("List is empty");
        }else if (pos < 0 || pos > length){
            System.out.println("Out of range");
        }
        else {
            for (int i = pos; i < length - 1 ; i++) {
                arr[i] = arr[i+1];
            }
            length--;
        }
    }
    public void insertAtEnd(T element){
        if (isEmpty()){
            System.out.println("List is empty");
        } else {
            arr[length] = element;
            length++;
        }
    }
    public void insertNoDuplicate(T element){
        if (search(element) == -1){
            insertAtEnd(element);
        } else {
            System.out.println("Element is there.....");
        }
    }

    public int search(T element){
        for (int i = 0; i <length ; i++) {
            if (arr[i] == element){
                return i;
            }
            else {
                return -1;
            }
        }
        return -1;
    }

    public void updateAt(int pos, T element){
        if (pos < 0 || pos > length){
            System.out.println("Out of range");
        } else {
            arr[pos] = element;
        }
    }

    public Object getElement(int pos) {
        if (pos < 0 || pos > length) {
            System.out.println("Out of range");
            return -1;
        }
        else {
            return arr[pos];
        }
    }


    public void clear(){
        length = 0;
    }

}
