package Assignment.Module4;

public class Student {
        static String college = "Sapthagiri College of Engineering";   // static variable
        String name;

        Student(String name) {
            this.name = name;
        }

        static void displayCollege() {   // static method
            System.out.println("College Name: " + college);
        }

        void display() {
            System.out.println("Student Name: " + name);
            System.out.println("College: " + college);
        }
    }

    class StaticVariable {
        public static void main(String[] args) {

            Student.displayCollege();   // calling static method

            Student s1 = new Student("Rahul");
            Student s2 = new Student("Anita");

            s1.display();
            s2.display();
        }
    }

