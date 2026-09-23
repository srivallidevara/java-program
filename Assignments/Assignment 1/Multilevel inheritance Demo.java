class Person {
    void introduce() {
        System.out.println("I am a person");
    }
}

class Student extends Person {
    void study() {
        System.out.println("Student studies");
    }
}

class EngineeringStudent extends Student {
    void coding() {
        System.out.println("Engineering student learns coding");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {

        EngineeringStudent e = new EngineeringStudent();

        e.introduce();
        e.study();
        e.coding();
    }
}