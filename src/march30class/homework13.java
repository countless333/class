package march30class;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class homework13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a  = new int[5];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();

        }
//        int z = Arrays.stream(a).max().getAsInt();
//        System.out.println(z); 중요******************8

//int max = a[0];
//        for(int i=1;i<a.length;i++){
//           if( a[0]<a[i]){
//
//               max = a[i];
//           }
//
//        }
//        System.out.println(max);

        int z = Arrays.stream(a).max().getAsInt();
        System.out.println(z);


    }
}
