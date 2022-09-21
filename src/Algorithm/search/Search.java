package Algorithm.search;

public class Search {

    private static Search instance;

    public static Search getInstance(){
        if (instance ==null) {
            return instance = new Search();
        }
        return instance;
    }

    public int linearSearch(int arr[],int element){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element){
                return i;
            }

        }
        return -1;
    }

    public int binarySearch(int arr[],int element){
        int left = 0;
        int right = arr.length - 1;
        while (left <= right){
            int middle = left + (right - left) / 2;
            if (arr[middle] == element){
                return element;
            }
            if (arr[middle] > element) // remove right
            {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
}
