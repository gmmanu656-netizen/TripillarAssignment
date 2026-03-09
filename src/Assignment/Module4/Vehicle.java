package Assignment.Module4;

interface Vehicle {
    void start(); // Public and abstract by default
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("The Car engine is roaring to life.");
    }
}

class _Interface {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();
    }
}