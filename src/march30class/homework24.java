package march30class;

import java.util.Arrays;
import java.util.Scanner;

public class homework24 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i =0; i<arr.length;i++){
            int a = sc.nextInt();

            arr[i] = a;

        }

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println(max + " " + min);





    }

}
