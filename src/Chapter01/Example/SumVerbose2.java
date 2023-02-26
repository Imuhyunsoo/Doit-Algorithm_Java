package Chapter01.Example;

import java.util.Scanner;

// 실습 1-11
public class SumVerbose2 {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("1부터 n 까지의 합을 구합니다.");

        do {
            System.out.print("n값: ");
            n = stdIn.nextInt();
        } while (n <= 0);

        int sum = 0;    // 합

        for (int i = 1; i < n; i++) {
                System.out.print(i + " + ");
            sum += i;   // sum 에 i를 더함
        }

        System.out.print(n + " = ");
        sum += n;       // sum 에 n를 더함
        System.out.println(sum);
        // System.out.println(n + " = " + (sum += n));
    }
}
