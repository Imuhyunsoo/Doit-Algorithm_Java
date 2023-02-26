package Chapter01.Example;

import java.util.Scanner;

// 실습 1-8
public class SumFor {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n 까지의 합 구합니다.");
        System.out.print("n 값: ");
        int n = stdIn.nextInt();

        int sum = 0;    // 합

        for(int i = 1; i <= n; i++)
            sum += i;   // sum 에 i를 더함

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
