package Chapter01.Practice;

import java.util.Scanner;

// 연습문제 9
public class AMinusB {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("a - b 값을 구합니다.");
        int a, b;

        do{
            System.out.print("a 값: ");
            a = stdIn.nextInt();
            System.out.print("b 값: ");
            b = stdIn.nextInt();
        } while (b >= a);

        int result = a - b;

        System.out.println(a + " - " + b + "의 값은 " + result + "입니다.");
    }
}
