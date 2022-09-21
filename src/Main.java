import Algorithm.search.Search;
import Algorithm.sort.Sort;
import heap.MaxHeap;
import tree.Tree;


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

        /*

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

         */

        // =================================================================================//


        /*
        LinkedList li = new LinkedList<Integer>();
        li.insertAtFirst(10);
        li.insertAtFirst(5);
        li.insertAtEnd(15);
        li.insertAtEnd(20);
        li.insertAtPos(4,25);
        li.removeEnd();
        li.reverse();
        System.out.println(li.search(15));
        li.remove(25);
        li.remove(15);
        li.remove(5);
        li.remove(10);
        li.remove(20);
        li.print();

         */

        // =================================================================================//

        /*

        DoublyLinkedList dli = new DoublyLinkedList<Integer>();
        dli.insertFirst(30);
        dli.insertLast(40);
        dli.insertLast(50);
        dli.insertAt(3,100);
        dli.insertAt(1,200);
        //dli.remove(40);
        //dli.removeLast();

        dli.print();
        System.out.println("--------------------------");

        dli.reverse();

         */

        // =================================================================================//

        /*
        Tree<Integer> tree = new Tree<>();

        tree.insert(10);
        tree.insert(5);
        tree.insert(20);
        tree.insert(15);
        tree.insert(50);
        tree.insert(3);
        tree.insert(9);
        System.out.println(tree.search(10));
        tree.delete(10);

        //tree.traverseInOrder();
        //System.out.println("----------------------------");
        tree.traversePreOrder();
        System.out.println("----------------------------");
        //tree.traversePostOrder();

        tree.traversLevelOrder();
        System.out.println(tree.findMinuiumValue());
        System.out.println(tree.findMaxmiumValue());



        */

        // =================================================================================//

        /*
        MaxHeap maxHeap = new MaxHeap(6);
        maxHeap.insert(3);
        maxHeap.insert(10);
        maxHeap.insert(5);
        maxHeap.insert(1);
        maxHeap.insert(50);
        maxHeap.insert(2);
        maxHeap.deleteRoot();
        maxHeap.print();

         */

        // =================================================================================//

        /*

        int[] arr1 =  {1,2,50,33,52,0,-10,66,-2,31,10,20};

        Sort sort = Sort.getInstance();

        System.out.println("----------  selection  ----------------");
        sort.selectionSort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }


        System.out.println("----------  bubble  ----------------");
        sort.bubbleSort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }




        System.out.println("----------  insertion  ----------------");
        sort.inserationSort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }


        System.out.println("----------  Quick  ----------------");
        sort.quickSort(arr1,0, arr1.length - 1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }


        System.out.println("----------  merge  ----------------");
        sort.mergeSort(arr1,0, arr1.length - 1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

         */

        int[] arr2 = {5,10,4,33,5,8,70,188,-20};
        Search search = Search.getInstance();
        System.out.println("---------linear search----------");
        System.out.println(search.linearSearch(arr2,8));
        System.out.println(search.linearSearch(arr2,88));

        int[] arr3 = {5,10,15,20,25,70,188};
        System.out.println("---------binary search----------");
        System.out.println(search.linearSearch(arr2,188));
        System.out.println(search.linearSearch(arr2,88));








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