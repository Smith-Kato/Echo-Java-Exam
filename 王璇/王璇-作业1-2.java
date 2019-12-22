import java.util.Scanner;
import java.util.Arrays;
public class Test1 {
    public static void main(String[] args) {
        int[] a = new int[20];
        int i;
        for(i = 0;i < 20; i++)
            a[i]=i;
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        for(i = b;i < 19;i++)
            a[i]=a[i+1];
        a[19] = 0;
        System.out.println(Arrays.toString(a));

    }
}
