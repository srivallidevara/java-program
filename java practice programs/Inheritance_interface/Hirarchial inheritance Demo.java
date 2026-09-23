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

class Mango extends Fruit {

    void color() {
        System.out.println("Mango is yellow");
    }
}

public class HierarchicalDemo {

    public static void main(String[] args) {

        Apple a = new Apple();
        Mango m = new Mango();

        a.taste();
        a.color();

        m.taste();
        m.color();
    }
}
```
