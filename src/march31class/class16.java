package march31class;

import java.util.Arrays;

public class class16 {


    public static void main(String[] args) {


        String g = "aweg-hhhhhhhhhhhhh-q-ee";


        String k = Arrays.stream(g.split("-")).reduce((z,x)->z.length()>x.length()?z:x).get();
        int maxlength = Arrays.stream(g.split("-")).mapToInt(String::length).reduce(Math::max).getAsInt();
        int maxlengthindex = Arrays.asList(g.split("-")).indexOf(Arrays.stream(g.split("-")).reduce((i,o)->i.length()>o.length()?i:o).get());
        System.out.println(maxlengthindex);












    }
}
