package stack;


public class Stack<T> {
    private final int MAX_SIZE = 100;
    private int top;

    private T [] item =  (T[]) new Object [MAX_SIZE] ;
    public Stack(){
        top = -1;
    }

    public void push(T element){
        if(top>= MAX_SIZE - 1)   // 0-99
        {
            System.out.print("Stack is Full");
        }

        else {
            top ++;
            item[top] = element;
        }
    }
    public void pop(){
        if(isEmpty()){
            System.out.print("Stack is Empty");
        } else {
            top--;
        }
    }

    public <T> T popWithReturnValue(){
        T value ;
        if(isEmpty()){
            System.out.print("Stack is Empty");
            value = null;
        } else {
            value = (T) item[top];
            top--;
        }
        return value;

    }

    public boolean isEmpty(){
        if(top == -1){
            return  true;
        }
        else {
            return  false;
        }
    }

    public T getTop(){

        return item[top];


    }

    public  void print(){
        for (int i = top; i >=0 ; i--) {
            System.out.println(item[i]);
        }
    }
}

