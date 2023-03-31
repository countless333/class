package march30class;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Scanner;

public class homework15 {

    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
boolean prime = true;
for(int i=1;i<n+1;i++){
for(int j=2;j<i;j++){
    prime = true;
    if(i%j==0){
        prime = false;
        break;
    }


}
    if(prime){
        a.add(i);
    }

}


        System.out.println(a);


    }
}
