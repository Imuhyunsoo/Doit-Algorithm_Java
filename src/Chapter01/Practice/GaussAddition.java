package Chapter01.Practice;

import java.util.Scanner;

// 연습문제 7
public class GaussAddition {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n 까지의 합 구합니다.");
        System.out.print("n 값: ");
        int n = stdIn.nextInt();

        int sum = (1 + n - n % 2) * (n / 2 + n % 2);

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
