```java
class Fruit {

    void taste() {
        System.out.println("Fruit is sweet");
    }
}

class Apple extends Fruit {

    void color() {
        System.out.println("Apple is red");
    }
}

public class InheritanceDemo {

    public static void main(String[] args) {

        Apple a = new Apple();

        a.taste();
        a.color();
    }
}
```
