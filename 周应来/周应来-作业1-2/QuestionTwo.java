import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();

        double S=Math.PI*r*r;

        System.out.println(String.format("%.2f", S));
    }
}
