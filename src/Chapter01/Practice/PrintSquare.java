package Chapter01.Practice;

import java.util.Scanner;

// 연습문제 13
public class PrintSquare {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.print("정사각형을 출력합니다. \n변의 길이: ");
        int length = stdIn.nextInt();

        for (int i = 0; i < length; i++) {
            System.out.println("*".repeat(length));
        }
    }
}
