package march30class;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class homework23 {

    public static void main(String[] args) {

        int[] arr = IntStream.range(1,101)
                .filter(a->a%2==0)
                .toArray();

        int arrz = IntStream.range(1,101)
                .filter(a->a%2==0)
                        .sum();
        System.out.println(Arrays.toString(arr));
        int summ=0;
        for(int i=0;i<arr.length;i++){
            summ+=arr[i];

        }
        System.out.println(summ);
        System.out.println(arrz);
    }


}
