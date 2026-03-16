package Assignment.Module7;

public class TimeComplexity {
    //linear search
    static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    // Binary Search
    static int binarySearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50, 60};
        int key = 30;

        int linearResult = linearSearch(arr, key);
        int binaryResult = binarySearch(arr, key);
        System.out.println("Linear Search Result Index: " + linearResult);
        System.out.println("Binary Search Result Index: " + binaryResult);

        System.out.println("\nTime Complexity Comparison:");
        System.out.println("Linear Search: O(n)");
        System.out.println("Binary Search: O(log n)");
        System.out.println("Binary Search requires sorted array.");
    }
}