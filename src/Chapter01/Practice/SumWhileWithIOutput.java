package Chapter01.Practice;

import java.util.Scanner;

// 연습문제 6
public class SumWhileWithIOutput {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n 까지의 합을 구합니다. ");
        System.out.print("n값: ");
        int n = stdIn.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n) {

            sum += i;
            i++;
        }
        System.out.println("i의 값은 : " + i + " 입니다.");
    }
}
