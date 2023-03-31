package march30class;

import java.lang.reflect.Array;
import java.util.Arrays;

public class homework31 {


    public static void main(String[] args) {


        String a = "aaaaaaaaaa";

        char[] k = new char[a.length()];

        for(int i=0;i<a.length();i++){

            if(i%3==0){

            k[i] = '3';
            }
            else if(i%5==0){
                k[i]='5';
            }
            else{
                k[i] = a.charAt(i);
            }


        }

        System.out.println(k);



    }
}
