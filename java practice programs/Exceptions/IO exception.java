```java
import java.io.*;

public class FileDemo {

    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("marks.txt");

            System.out.println("File opened successfully");
        }
        catch (IOException e) {
            System.out.println("Unable to open file");
        }
    }
}
```
