import java.util.Arrays;
import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        int n, i;
        int a[]={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        for (i = n; i<19;i++)
        {
            a[i] = a[i+1];
        }
        a[19]=0;
        System.out.println(Arrays.toString(a));

            }
}
