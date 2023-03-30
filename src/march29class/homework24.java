package march29class;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class homework24 {


    public static void main(String[] args) {
        int sum = Stream.of(1,2,3).reduce(0,Integer::sum);


        System.out.println(sum);
    }






}
