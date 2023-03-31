package march30class;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class homework25 {

    public static void main(String[] args) {




        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];
        for(int i =0; i<arr.length;i++){
            String a = sc.next();

            arr[i] = a;

        }

        int z = Arrays.stream(arr).map(a->a.length()).max(Comparator.naturalOrder()).get();
        System.out.println(z);


    }





}
