package Assignment.Module4;

abstract class Shape {
    abstract void display(); // No body, just a signature
}

class Circle extends Shape {
    @Override
    void display() {
        System.out.println("Displaying properties of a Circle: Round and 360 degrees.");
    }
}

class Q1_Abstraction {
    public static void main(String[] args) {
        Shape myCircle = new Circle();
        myCircle.display();
    }
}


