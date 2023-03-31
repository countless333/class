package march30class;

import java.util.ArrayList;
import java.util.Scanner;

public class homework16 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> ass = new ArrayList<>();
       for(int i=1;i<n+1;i++){
           if(n%i==0){
               ass.add(i);

           }


       }

        System.out.println(ass);

    }
}
