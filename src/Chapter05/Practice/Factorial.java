package Chapter05.Practice;

import java.util.Scanner;

// 연습문제 1 : 실습 5-1의 factorial 메서드를 재귀 메서드 호출을 사용하지 말고 작성하세요.
public class Factorial {

    static int factorial(int n) {

        int answer = 1;

        for (int i = 1; i <= n; i++)
            answer *= i;
        return answer;
    }

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요.: ");
        int x = stdIn.nextInt();

        System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
    }
}
