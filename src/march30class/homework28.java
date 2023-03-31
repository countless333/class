package march30class;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class homework28 {

    public static void main(String[] args) {

//        Stream<Integer> numbers = Stream.of(1,2,3,4,5,6,7,8,9,10);
//        Optional<Integer> sum = numbers.reduce((x,y)->x+y);
//        System.out.println(sum);
//sum.ifPresent(s-> System.out.println(s));


//        IntStream aa = IntStream.range(0, 10);
//        OptionalInt zz = aa.reduce((a, b) -> a + b);
//        zz.ifPresent(s -> System.out.println(s));

IntStream aa = IntStream.range(0,10);
OptionalInt zz = aa.reduce((a,b)->a+b);
zz.ifPresent(s-> System.out.println(s));
    }
}
