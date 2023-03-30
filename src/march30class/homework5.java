package march30class;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class homework5 {

    //2,3,5,7,11,13,


    public static void main(String[] args) {
        int count = 0;
        boolean prime;
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();

        }
        boolean primee=true;
        for(int i=0;i<a.length;i++){
            for(int j=2;j<a[i];j++){
                primee=true;
                if(a[i]%j==0){
                    primee=false;
                    break;
                }

            }
            if(primee){
                count++;
            }
        }
        System.out.println(count);

//
//        int[] a = new int[5];
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < a.length; i++) {
//            a[i] = scanner.nextInt();
//        }
//        ArrayList<Integer> k = new ArrayList<>();
//        for (int i = 0; i < a.length; i++) {
//            boolean isPrime = true;
//            for (int j = 2; j < a[i]; j++) {
//                if (a[i] % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime) {
//                k.add(a[i]);
//            }
//        }
//        System.out.println("입력한 수 중 소수는 " + k + "입니다.");


    }


}
