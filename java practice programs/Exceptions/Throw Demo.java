```java
public class ThrowDemo {

    public static void main(String[] args) {

        int age = 15;

        if (age < 18) {
            throw new ArithmeticException("Not eligible");
        }

        System.out.println("Eligible");
    }
}
```

**Output:**

```text
Exception in thread "main" java.lang.ArithmeticException: Not eligible
```

👉 `age < 18` kabatti maname `throw` use chesi exception raise chesam.

---

### 2️⃣ `throws` Example

`throws` → **method exception ni throw cheyyachu ani declare cheyyadaniki** use chestham.

```java
import java.io.*;

public class ThrowsDemo {

    static void readFile() throws IOException {

        FileReader file = new FileReader("data.txt");

        System.out.println("File opened");
    }

    public static void main(String[] args) {

        try {
            readFile();
        }
        catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
```

