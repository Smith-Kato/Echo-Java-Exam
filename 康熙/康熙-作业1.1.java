```java
import java.sql.SQLOutput;
import java.util.Scanner;

public class Text1 {
    public static void main(String[] args) {
        int r;
        double s;
        Scanner rad = new Scanner(System.in);
        r = rad.nextInt();
        s = r * r * Math.PI;
        System.out.println(String.format("%.2f", s));
    }
}

```

