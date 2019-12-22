import java.util.Scanner;
import java.lang.Math;
public class Test2 {
    public static void main(String[] args) {
        Scanner bj = new Scanner(System.in);
        System.out.println("请输入圆半径：");
        int r = bj.nextInt();
        double s = Math.PI * r * r ;
        System.out.println("圆面积为：");
        System.out.printf("%.2f",s);
    }
}
