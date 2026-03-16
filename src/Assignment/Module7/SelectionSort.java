package Assignment.Module7;

import java.util.Arrays;

public class SelectionSort {
    public static void Selectionsort(int []arr){
        for(int i=0;i<arr.length;i++){
            int minIndex=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        int []arr={45,48,81,31,11,25};
        System.out.println(Arrays.toString(arr));
        Selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}