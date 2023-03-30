package march30class;
///재귀
import java.util.Scanner;

public class homework3 {
    //val7
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int sum=1;
//        for(int i=n;i>=1;i--){
//            sum*=i;
//        }
//
//        System.out.println(sum);
        System.out.println(homework3.kk(5));



    }
//    public static int factorial(int n) {
//        if (n == 0) { // 0!은 1
//            return 1;
//        } else {
//            return n * factorial(n - 1);
//        }
//    }
public static int kk(int a){

        if(a==0){
            return 1;
        }
        return a*kk(a-1);
}
}


