
package Assignment.Module8;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "parameter";
        String result = "";
        for(int i = 0; i < str.length(); i++){
            if(result.indexOf(str.charAt(i)) == -1){
                result+=str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
