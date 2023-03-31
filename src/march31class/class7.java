package march31class;

import java.util.Arrays;
import java.util.Scanner;

public class class7 {
    public static void main(String[] args) {









//        String a = "aopzAOOZ";
////XlmwDRRc
//        int b = 3;
                Scanner sc = new Scanner(System.in);
                System.out.println("알파뱃을 쓰시오");
                String a = sc.next();
                System.out.println("정수를 쓰시오");
                int b = sc.nextInt();
                char[] d =new char[a.length()];
                for(int i=0; i<a.length();i++){

                    d[i] = a.charAt(i);

                }

                char[] q = new char[d.length];

                for(int i=0;i<a.length();i++) {
                    if (d[i]<=90&&d[i]>=65){

                        if(!(((char)((int)d[i]+b)<=90&&(char)((int)d[i]+b)>=65)||((char)((int)d[i]+b)>=97&&(char)((int)d[i]+b)<=122))) {
                            q[i] = (char)((int)d[i]+b+6);
                        }else{
                            q[i] = (char)((int)d[i]+b);
                        }



                    } else if (d[i]>=97&&d[i]<=122) {
                        if(!(((char)((int)d[i]-b)<=90&&(char)((int)d[i]-b)>=65)||((char)((int)d[i]-b)>=97&&(char)((int)d[i]-b)<=122))) {
                            q[i] = (char)((int)d[i]-b-6);
                        }else{
                            q[i] = (char)((int)d[i]-b);
                        }






                    }
                }

                System.out.println(Arrays.toString(q));
            }



        }




