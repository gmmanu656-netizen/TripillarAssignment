package Assignment.Module8;

public class NumberSetBits {
    public static void main(String[] args) {
        int num=9;
        int count=0;
        while(num>0) {
            if (num%2==1){
                count++;
            }
            num=num/2;
        }
        System.out.println("Set Bits: " + count);
    }
}