```java
class Employee {

    String name = "Ravi";
    int salary = 25000;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class ClassObjectDemo {

    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.display();
    }
}
```
