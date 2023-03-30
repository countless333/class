package march30class;

import java.util.Arrays;
import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("몇개의 숫자를 입력한거야?");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
a[i]=sc.nextInt();


        }
        Arrays.sort(a);
int max = a[n-1];
int min = a[0];
int avg = a[n/2];
System.out.println(max);
        System.out.println(min);
        System.out.println(avg);

    }







}
