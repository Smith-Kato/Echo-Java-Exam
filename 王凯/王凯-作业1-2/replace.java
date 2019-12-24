package 练习.a;
import java.util.Scanner;

public class replace{
    public static void main(String[] args) {
        int s,t=0;
        int []a = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        Scanner scan = new Scanner(System.in);
        s = scan.nextInt();
        System.out.print("[");
        for (int i = 0; i < 20; i++) {
            if(a[i] == s){
                a[i] = 0;
                t = i;}
            else
                System.out.print(a[i]);
            if(i <= 19 && i != s)
                System.out.print(", ");
        }
        System.out.print(a[t]);
        System.out.println("]");
    }
}