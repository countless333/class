package march30class;

import java.util.Arrays;
import java.util.stream.IntStream;

public class homework26 {
    public static void main(String[] args) {




        int[] k = new int[4];
        int[] kk = new int[3];
        for(int i=0;i<k.length;i++){
            k[i] = (int)(Math.random()*100+1);

        }
        for(int i=0;i<kk.length;i++){
            kk[i] = (int)(Math.random()*100+1);

        }
        System.out.println(Arrays.toString(k));
        System.out.println(Arrays.toString(kk));

    }
}
