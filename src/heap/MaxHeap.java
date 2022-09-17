package heap;

public class MaxHeap {
    private int [] Heap;
    private int size;
    private int maxSize;

    public MaxHeap(int size){
        this.maxSize = size;
        this.size = 0;
        Heap = new int [this.maxSize + 1];
        Heap[0] = Integer.MAX_VALUE;
    }

    private int parentNode(int pos){
        return pos / 2;
    }

    private int leftChild(int pos){
        return pos * 2;
    }

    private int rightChild(int pos){
        return (pos * 2) + 1;
    }

    private void downHeapify(int pos){
        // check if the node is leaf node
        if (pos >= size / 2 && pos <= size){
            return;
        }

        // check if a swap is needed
        if (Heap[pos] < Heap[leftChild(pos)] || Heap[pos] < Heap[rightChild(pos)]) {
            // replace parent with max of left or right of its children
            if (Heap[leftChild(pos)] > Heap[rightChild(pos)]){
                swap(pos,leftChild(pos));
                // after swaping heapfing is called on children
                downHeapify(leftChild(pos));
            } else {
                swap(pos,rightChild(pos));
                downHeapify(rightChild(pos));
            }
        }
    }

    private void swap(int fpos, int spos) {
        int tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }

    private void heapifyUp(int pos) {
        int temp = Heap[pos];
        while (pos > 0 && temp > Heap[parentNode(pos)]){
            Heap[pos] = Heap[parentNode(pos)];
            pos = parentNode(pos);
        }
        Heap[pos] = temp;
    }

    public void insert(int element) {
        if (size == maxSize){
            System.out.println("out of range");
            return;
       }
        Heap[++size] = element;
        int current = size;
        heapifyUp(current);
    }

    // for heap delete is only for root node
    public int deleteRoot(){
        int max = Heap[1];
        Heap[1] = Heap[size--];
        downHeapify(1);
        return max;
    }

    public void print(){
        for (int i = 1; i < Heap.length; i++){
            System.out.println(Heap[i]);
        }
    }


}
