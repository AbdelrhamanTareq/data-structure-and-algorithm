import stack.LinkedStack;
import stack.Stack;

public class Main {
    public static void main(String arg[]){
        Stack<Integer> s = new Stack<>();
        s.push(5);
        s.push(10);
        s.push(15);
        s.push(20);
        s.push(25);
        s.print();
        System.out.println("---------------------------");
        LinkedStack<Integer> s1 = new LinkedStack<Integer>();
        s1.pop();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.pop();
        System.out.println(s1.getTop());
        s1.print();


    }
}
