package march30class;

import java.util.Scanner;

public class homework20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요: ");
        int a = scanner.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        int b = scanner.nextInt();
        int gcd = getGCD(a, b);
        int lcm = getLCM(a, b, gcd);
        System.out.println("두 수의 최대공약수: " + gcd);
        System.out.println("두 수의 최소공배수: " + lcm);
        scanner.close();
    }

    // 최대공약수 구하기
    public static int getGCD(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }



    // 최소공배수 구하기
    public static int getLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}