class Person {
    void showPerson() {
        System.out.println("This is a person");
    }
}

class Student extends Person {
    void study() {
        System.out.println("Student studies");
    }
}

class SportsStudent extends Student {
    void play() {
        System.out.println("Student plays sports");
    }
}

class Employee extends Person {
    void work() {
        System.out.println("Employee works");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {

        SportsStudent s = new SportsStudent();
        s.showPerson();
        s.study();
        s.play();

        Employee e = new Employee();
        e.showPerson();
        e.work();
    }
}