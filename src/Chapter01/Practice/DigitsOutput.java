package Chapter01.Practice;

import java.util.Scanner;

// 연습문제 10
public class DigitsOutput {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("n의 자릿수를 구합니다.");
        System.out.print("n 값: ");
        int n = stdIn.nextInt();

        int answer = 1;

        for(int i = 1; i <= 10; i++) {

            if(n - (int) Math.pow(10,i) >= 0) {
                answer++;
            } else
                break;
        }
        System.out.println("그 수는 " + answer + "자리입니다.");
    }
}
