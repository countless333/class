package march31class;

import java.util.Arrays;

public class class8 {

    public static void main(String[] args) {


        String a = "2g4arhrhh5;";

        char[] v = new char[a.length()];
        for(int i=0;i<a.length();i++){
            v[i] = a.charAt(i);

        }

        System.out.println(Arrays.toString(v));
Arrays.sort(v);
        System.out.println(Arrays.toString(v));
    }
}
