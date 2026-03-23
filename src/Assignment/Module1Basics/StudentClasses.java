package Assignment.Module1Basics;

public class StudentClasses {
    int USN;
    String name;
    int marks;
void display(){
    System.out.println("USN:"+USN );
    System.out.println("name:"+name);
    System.out.println("marks:"+marks);
}
    static void main(String[] args) {
        StudentClasses s1 = new StudentClasses();
        s1.USN=100;
        s1.name="James Bond";
        s1.marks=20;;
        StudentClasses s2 = new StudentClasses();
        s2.USN=101;
        s2.name="Bond James";
        s2.marks=101;
        s1.display();
        s2.display();
    }
}
