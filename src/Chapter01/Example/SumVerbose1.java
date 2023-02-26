package Chapter01.Example;

import java.util.Scanner;

// 실습 1-10
public class SumVerbose1 {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("1부터 n 까지의 합을 구합니다.");

        do {
            System.out.print("n값: ");
            n = stdIn.nextInt();
        } while (n <= 0);

        int sum = 0;    // 합

        for (int i = 1; i <= n; i++) {
            if(i < n)   // 중간 과정
                System.out.print(i + " + ");
            else        // 마지막 과정
                System.out.print(i + " = ");
            sum += i;   // sum 에 i를 더함
        }

        System.out.println(sum);
    }
}
