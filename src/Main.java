import array.Array;
import queue.LinkedQueue;
import queue.Queue;
import stack.LinkedStack;
import stack.Stack;

public class Main {
    public static void main(String arg[]){
        /*
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
        System.out.println("---------------------------");
        String exp = "((2*3))+{3*5}}";
        boolean areBalanced = areBalanced(exp);
        System.out.println(areBalanced);
        System.out.println("---------------------------");
        String exp2 = "{((2*3))+{3*5}}";
        boolean areBalanced2 = areBalanced(exp2);
        System.out.println(areBalanced2);

         */

        // ------------------------------------------------------------------------------------ //

        /*
        Array<Integer> arr = new Array<Integer>(5);
        arr.insert(0);
        arr.insert(10);
        arr.insert(20);
        arr.insert(30);
        arr.insert(40);
        arr.removeAtPos(0);
        arr.removeAtPos(1);
        arr.removeAtPos(2);
        arr.removeAtPos(1);
        arr.removeAtPos(0);
        System.out.println(arr.isFull());
        arr.print();

         */

        // =================================================================================//
/*
        Queue<Integer> q = new Queue<>(5);
        q.enqueue(0);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        System.out.println(q.getFront());
        System.out.println(q.getRear());
        q.print();
        System.out.println(q.search(50));

 */

        // =================================================================================//

        LinkedQueue<Integer> lq= new LinkedQueue<Integer>();
        System.out.println(lq.getFront());
        System.out.println(lq.getRear());
        lq.enqueue(10);
        lq.enqueue(20);
        lq.enqueue(30);
        lq.dequeue();
        //lq.clear();
        lq.print();
        System.out.println("---------------");
        System.out.println(lq.getFront());
        System.out.println(lq.getRear());
        System.out.println(lq.getSize());


    }
}


/*
    static boolean arePair(char open, char close){
        if (open == '(' && close == ')'){
            return true;
        } else if (open == '{' && close == '}') {
            return true;
        } else if (open == '[' && close == ']') {
            return true;
        }
        return false;
    }

    static boolean areBalanced(String expression){
        LinkedStack<Character> s = new LinkedStack<Character>();
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(' || expression.charAt(i) == '{' || expression.charAt(i) == '['){
                s.push(expression.charAt(i));
            } else if (expression.charAt(i) == ')' || expression.charAt(i)== '}' || expression.charAt(i)== ']') {
                if (s.isEmpty() || ! arePair((Character) s.getTop(), expression.charAt(i))) {
                    return  false;
                }
                else {
                    s.pop();
                }
            }
        }
        return s.isEmpty() ? true : false;
    }
}

 */