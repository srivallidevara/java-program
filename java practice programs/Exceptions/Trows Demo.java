```java
public class ThrowsDemo {

    static void show() throws Exception {

        System.out.println("Hello");
    }

    public static void main(String[] args) {

        try {
            show();
        }
        catch (Exception e) {
            System.out.println("Exception handled");
        }
    }
}
```

