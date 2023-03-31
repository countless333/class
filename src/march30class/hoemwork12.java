package march30class;

import java.util.Scanner;

public class hoemwork12 {


    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();


        String g = a==100?"100":
                a>100?"100보다큼":"100보다작음";

        System.out.println(g);


    }



}
