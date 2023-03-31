package march31class;

import java.lang.reflect.Array;
import java.util.Arrays;

public class class6 {
    public static void main(String[] args) {




        String a = "aawefwefwef-wrb-enrnn";

        String[] k = Arrays.stream(a.split("-")).toArray(String[]::new);
//        int maxlength = Arrays.stream(k).mapToInt(String::length).reduce(0,(z,b)->z>b?z:b);

        String max = Arrays.stream(k).reduce("",(h,n)->h.length()>n.length() ? h:n);
        System.out.println(max);
        System.out.println(Arrays.asList(k).indexOf(max));
//        int maxindex = Arrays.asList(a.split("-")).indexOf(Arrays.stream(k).filter(v->v.length()==maxlength).findFirst().get());
//        System.out.println(k[maxindex]);






    }
}
