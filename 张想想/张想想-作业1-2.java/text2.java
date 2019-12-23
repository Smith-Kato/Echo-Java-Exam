import java.util.Scanner;

public class text2 {
    public static void main(String[] args) {
        int i, a, num[] = {0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12, -13, -14, -15, -16, -17, -18, -19};
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.print("[");
        for (i = 0; i <= 19; i++) {
            if (i == a) {
            } else {
                System.out.print(num[i]);
                System.out.print(", ");
            }
        }
        System.out.println("0]");
    }
}
