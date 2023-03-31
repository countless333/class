package march30class;

import java.util.Scanner;

public class homework22 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int sum=0;
while(true){
    String k = sc.next();
    if(k.equals("q")){
        break;
    }
    sum+=Integer.parseInt(k);
    System.out.println(sum);

}


    }
}
