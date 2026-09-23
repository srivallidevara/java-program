```java
public class MultipleException {

    public static void main(String[] args) {

        try {
            int a = 25;
            int b = 0;

            System.out.println(a / b);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        catch (NullPointerException e) {
            System.out.println("Null value");
        }
    }
}
```


