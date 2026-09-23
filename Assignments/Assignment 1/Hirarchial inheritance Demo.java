class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}

class Manager extends Employee {
    void manage() {
        System.out.println("Manager manages the team");
    }
}

class Developer extends Employee {
    void code() {
        System.out.println("Developer writes code");
    }
}

class Tester extends Employee {
    void test() {
        System.out.println("Tester tests the software");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {

        Manager m = new Manager();
        m.work();
        m.manage();

        Developer d = new Developer();
        d.work();
        d.code();

        Tester t = new Tester();
        t.work();
        t.test();
    }
}