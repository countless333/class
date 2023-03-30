package march29class;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class homework23 {
    public static void main(String[] args) {



//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//
//        Optional<Integer> result = list.stream()
//                .reduce(Integer::sum);


        List<String> list = Arrays.asList("apple", "banana", "carrot", "dragon fruit");

        List<String> result = list.stream()
                .sorted(String::compareToIgnoreCase)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
