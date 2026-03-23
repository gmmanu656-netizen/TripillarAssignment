package Assignment.module11recursion;

public class BinaryStrings {
    public static void main(String[] args) {
        int n = 3;
        char[] result = new char[n];
        System.out.println("Binary strings of length " + n + ":");
        generateBinary(n, result, 0);
    }

    /**
     * @param n The total length required
     * @param arr The array storing the current characters
     * @param i The current index we are filling
     */
    public static void generateBinary(int n, char[] arr, int i) {
        // Base Case: If the current index equals n, the string is full
        if (i == n) {
            System.out.println(new String(arr));
            return;
        }

        // Assign '0' at current position and recurse for the next index
        arr[i] = '0';
        generateBinary(n, arr, i + 1);

        // Assign '1' at current position and recurse for the next index
        arr[i] = '1';
        generateBinary(n, arr, i + 1);
    }
}
