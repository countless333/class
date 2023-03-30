package march30class;

import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int index = n;
        while(index>=1){
if(index-1<=0){
    break;
}
          n*=index-1;
            index--;

        }


        System.out.println(n);





    }







}
