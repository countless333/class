package march29class;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class homework25 {
    List<Integer> integerlist = Arrays.asList(1,2,3,4,5);

int[] maptoint = integerlist.stream().mapToInt(a->a).toArray();

    public static void main(String[] args) {

        Stream.of("a1", "a2","a3")
                .map(a->a.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);





    }

}
