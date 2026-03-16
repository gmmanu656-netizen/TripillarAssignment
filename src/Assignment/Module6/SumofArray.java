package Assignment.Module6;

class SumOfArray {
    public static void main(String[] args) {
        int [] arr ={2,4,6,8,10};
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of Array: "+sum);
    }
}