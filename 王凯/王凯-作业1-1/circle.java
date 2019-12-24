package 练习.a;
import java.text.DecimalFormat;
import java.util.Scanner;

public class circle{
    public static void main(String[] args) {
        int r;
        double s;
        Scanner scan = new Scanner(System.in);
        r = scan.nextInt();
        s = r * r * Math.PI;
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(df.format(s));
    }
}
