package Assignment.Module4;

public class Immutability {

    public static void main(String[] args) {
            String original = "Java";
            String modified = original.concat(" Programming");

            System.out.println("Original String: " + original); // Still "Java"
            System.out.println("Modified String: " + modified); // New object "Java Programming"

            if(original == modified) {
                System.out.println("Same object.");
            } else {
                System.out.println("Different objects! String is immutable.");
            }
        }
    }

