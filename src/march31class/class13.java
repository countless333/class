package march31class;

import java.util.Arrays;

public class class13 {

    public static void main(String[] args) {

        String a = "hh-qerhqehr-qhq--qherqhqehr";

        String v = Arrays.stream(a.split("-")).reduce((n,m)->n.length()>m.length()?n:m).get();
        System.out.println(v);

        int maxStringlength = Arrays.stream(a.split("-")).mapToInt(String::length).reduce(Math::max).getAsInt();
        int maxStringindex = Arrays.asList(a.split("-")).indexOf(Arrays.stream(a.split("-")).filter(n->n.length()==maxStringlength).findFirst().get());

        System.out.println(a.split("-")[maxStringindex]);




    }
}
