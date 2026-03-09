package Assignment.Module4;

final class Animal {

        void display() {
            System.out.println("This is a final class");
        }
    }

/*
class Dog extends Animal {   // ❌ This will cause an error
}
*/

    class FinalClass {
        public static void main(String[] args) {
            Animal a = new Animal();
            a.display();
        }
    }

