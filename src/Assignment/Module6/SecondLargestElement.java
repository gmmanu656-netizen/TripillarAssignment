package Assignment.Module6;

public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[] = {10,20,36,45,99};
        int largest = arr[0];
        int second = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                second = largest;
                largest = arr[i];
            }
        }
        System.out.println("Second Largest = " + second);
    }
}