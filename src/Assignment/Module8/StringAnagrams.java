package Assignment.Module8;

import java.util.Arrays;

public class StringAnagrams {
    public static void main(String[] args) {
        String s1 = "night";
        String s2 = "thing";
        char a1[] = s1.toCharArray();
        char a2[] = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if(Arrays.equals(a1,a2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}