import java.util.Scanner;

public class text1 {
    public static void main(String[] args) {
        int r;
        double s;
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        s = Math.PI * r * r;
        System.out.println(String.format("%.2f", s));
    }
}