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
        System.out.println("---------------------------");
        String exp = "((2*3))+{3*5}}";
        boolean areBalanced = areBalanced(exp);
        System.out.println(areBalanced);
        System.out.println("---------------------------");
        String exp2 = "{((2*3))+{3*5}}";
        boolean areBalanced2 = areBalanced(exp2);
        System.out.println(areBalanced2);


    }



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
