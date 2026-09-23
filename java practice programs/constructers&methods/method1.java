```java
class Student {

    String name;
    int age;

    // Constructor
    Student() {
        name = "Srivalli";
        age = 20;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.display();
    }
}
```




```java
class Car {

    String color;

    // Constructor
    Car() {
        color = "Red";
    }

    public static void main(String[] args) {

        Car c1 = new Car();

        System.out.println("Car color: " + c1.color);
    }
}
```

