package Assignment.Module4;

public class Stringdiff {
        public static void main(String[] args) {

            // String (Immutable)
            String s = "Hello";
            s.concat(" World");
            System.out.println("String: " + s);

            // StringBuilder (Mutable)
            StringBuilder sb = new StringBuilder("Hello");
            sb.append(" World");
            System.out.println("StringBuilder: " + sb);

            // StringBuffer (Mutable)
            StringBuffer sbf = new StringBuffer ();
            sbf.append(" World");
            System.out.println("StringBuffer: " + sbf);
        }
    }

