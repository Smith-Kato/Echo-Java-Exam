package mn;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {
        int[] num ={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        int i,t;

        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();

        for ( i = t; i < 19; i++) {
            num[i]=num[i+1];
        }
        num[19]=0;

        System.out.println(Arrays.toString(num));
    }
}
