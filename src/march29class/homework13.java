package march29class;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class homework13 {
    public static void main(String[] args) {
        Integer[] kkk = new Integer[20];
        for(int i=0;i<20;i++){

            kkk[i]=i+1;
        }
        homework13.printArr(kkk);

    }

    public static <T>void printArr(T[] t){

        ArrayList<Integer> zzz = new ArrayList<>();
        for(T z : t){
            if((int)z%3==0){
                zzz.add((Integer) z);

            }


        }
        System.out.println(zzz);
    }


}
