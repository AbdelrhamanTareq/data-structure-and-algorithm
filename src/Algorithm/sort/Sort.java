package Algorithm.sort;

public class Sort {

    private Sort() {
    }

    private static Sort instance;

    public static Sort getInstance() {
        if (instance == null) {
            return new Sort();
        }
        return instance;
    }


    public void selectionSort(int arr[]) {
        int minIndex;
        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }

            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

    }

    public void bubbleSort(int arr[]) {
        boolean isSorted = true;
        int c = 0;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }
                c++;
            }
            if (isSorted) {
                System.out.println("sorted");
                return;
            }
        }
        //System.out.println(c);
    }

    public void inserationSort(int arr[]) {
        int key, j;
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    private void merge(int arr[], int left, int middle, int right) {

        int n1 = middle - left + 1; // first sub array
        int n2 = right - middle; // second sub array

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[middle + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }

    public void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }

    private int parition1(int arr[], int start, int end) {
        int i = start, j = end, pivot = i;
        while (true) {
            while (arr[pivot] <= arr[j] && j != pivot) {
                j--;
            }
            if (j == pivot) {
                break;
            } else if (arr[pivot] > arr[j]) {
                // swap

                int temp = arr[pivot];
                arr[pivot] = arr[j];
                arr[j] = temp;


                // swap(arr[j],arr[pivot]);
                pivot = j;
            }
            while (arr[pivot] >= arr[i] && i != pivot) {
                i++;
            }
            if (i == pivot) {
                break;
            } else if (arr[pivot] < arr[i]) {
                // swap

                int temp = arr[pivot];
                arr[pivot] = arr[i];
                arr[i] = temp;


                // swap(arr[pivot],arr[i]);
                pivot = i;
            }
        }
        return pivot;
    }

    private int parition2(int arr[], int start, int end) {
        int i = start, j = end;
        int pivot = arr[i];
        while (i < j) {
            do {
                i++;
            } while (arr[i] <= pivot);
            do {
                j--;
            } while (arr[j] > pivot);
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return j;
    }

    public void quickSort(int arr[], int start, int end) {


        if (start < end) {
            int pivot = parition1(arr, start, end);
            quickSort(arr, start, pivot); // form start to pivot
            quickSort(arr, pivot + 1, end);// from element next to pivot to end

        }

    }

    private void heapify(int arr[], int size, int index) {
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        int max = index;

        if (left < size && arr[left] > arr[max]) {
            max = left;
        }
        if (right < size && arr[right] > arr[max]) {
            max = right;
        }
        if (max != index) {
            int temp = arr[index];
            arr[index] = arr[max];
            arr[max] = temp;
            heapify(arr, size, max);
        }
    }

    private void buildHeap(int arr[], int size) {

        for (int i = (size / 2) - 1; i >= 0; i--) {
            heapify(arr, size, i);
        }
    }

    public void heapSort(int arr[]) {
        int size = arr.length;
        buildHeap(arr, size);
        for (int i = size - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }


    }
}
