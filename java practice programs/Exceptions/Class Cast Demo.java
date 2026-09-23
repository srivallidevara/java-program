```java
class Shape {
}

class Circle extends Shape {
}

class Square extends Shape {
}

public class ClassCastDemo {

    public static void main(String[] args) {

        Shape s = new Square();

        Circle c = (Circle) s;

        System.out.println("Circle object");
    }
}
```
