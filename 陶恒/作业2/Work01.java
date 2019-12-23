import org.w3c.dom.ls.LSOutput;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Work01 {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int R = r.nextInt();
        double S = R * R * Math.PI;
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(df.format(S));
    }
}
