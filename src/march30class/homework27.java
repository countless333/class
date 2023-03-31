package march30class;

import java.util.Arrays;
import java.util.Comparator;

public class homework27 {
    public static void main(String[] args) {
        String a = "a-eg-wh-hhhh-w";
        String[] k = a.split("-");
        System.out.println(Arrays.toString(k));

//        int V = Arrays.stream(k).map(v->v.length()).max(Comparator.naturalOrder()).index;
//        System.out.println(V);


    }
}
