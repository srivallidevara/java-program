```java
public class NullDemo {

    public static void main(String[] args) {

        String name = null;

        System.out.println(name.length());
    }
}
```




```java
public class NullDemo {

    public static void main(String[] args) {

        String studentName = null;

        try {
            System.out.println("Student Name: " + studentName);
            System.out.println("Name Length: " + studentName.length());
        }
        catch (NullPointerException e) {
            System.out.println("Student name is null");
        }
    }
}
```

