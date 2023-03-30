package march29class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class homework22 {
    public static void main(String[] args) {
List<Integer> ss = Arrays.asList(5, 12, 66);
List<String> gg = ss.stream()
        .map(homework22::parsee)
        .collect(Collectors.toList());

        System.out.println(gg);

    }
//스트링 리스트에서 40이 넘는 숫자만

public static String parsee(Integer s){

        return String.valueOf(s);
}


}
