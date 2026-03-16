package Assignment.Module7;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr={1,3,5,7,9,11,13,15,17,19};
        int target=17;
        int low=0;
        int high=arr.length-1;
        int index=1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                index=mid;
                break;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if (index!=1){
            System.out.println("Element "+target+" found at "+index);
        }
        else {
            System.out.println("Target not found");
        }
    }
}