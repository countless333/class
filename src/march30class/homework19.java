package march30class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class homework19 {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt();
        Integer b = sc.nextInt();
        boolean prime = true;
        ArrayList<Integer>kkk = new ArrayList<>();
        for(int i=1;i<a+1;i++){

               if(a%i==0){
                   kkk.add(i);
               }
        }
        ArrayList<Integer>kkk2 = new ArrayList<>();
        for(int i=1;i<b+1;i++){

            if(b%i==0){
                kkk2.add(i);
            }
        }
ArrayList<Integer> gong = new ArrayList<>();
        for(int i=0;i<kkk.size();i++){

            for(int j=0;j<kkk2.size();j++){
                if(kkk.get(i)==kkk2.get(j)){
                    gong.add(kkk.get(i));
                }

            }
        }
        System.out.println(gong);
        System.out.println();
        int z = gong.stream().max(Comparator.naturalOrder()).get();
        System.out.println(z);
        System.out.println(a*(b/z));

    }
}
