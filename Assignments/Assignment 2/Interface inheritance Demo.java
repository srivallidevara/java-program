interface Vehicle {
    void start();
}

interface Car extends Vehicle {
    void drive();
}

class BMW implements Car {

    public void start() {
        System.out.println("Car starts");
    }

    public void drive() {
        System.out.println("Car is driving");
    }
}

public class InterfaceInheritance {
    public static void main(String[] args) {

        BMW b = new BMW();

        b.start();
        b.drive();
    }
}