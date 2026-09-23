
interface Fruit {

    void taste();
}

class Apple implements Fruit {

    public void taste() {
        System.out.println("Apple is sweet");
    }
}

class Mango implements Fruit {

    public void taste() {
        System.out.println("Mango is sweet");
    }
}

class FruitBasket extends Apple {

    void display() {
        System.out.println("Fruit basket");
    }
}

public class HybridDemo {

    public static void main(String[] args) {

        FruitBasket f = new FruitBasket();

        f.taste();
        f.display();
    }
}