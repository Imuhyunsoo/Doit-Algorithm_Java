package Chapter02.Practice;

import java.util.Random;
import java.util.Scanner;

// 연습문제 1 : 키뿐만 아니라 사람 수도 난수로 생성하도록 실습 2-4를 수정하여 프로그램을 작성하세요.
public class MaxOfArrayRand {

    // 배열 a의 최댓값을 구하여 반환
    static int maxOf(int[] a) {

        int max = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] > max)
                max = a[i];

        return max;
    }

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");
        int num = rand.nextInt(16);
        System.out.println("사람 수: " + num);

        int[] height = new int[num];                    // 요솟수가 num 인 배열을 생성

        System.out.println("킷값은 아래와 같습니다.");

        for (int i = 0; i < num; i++) {
            height[i] = 100 + rand.nextInt(90);   // 요솟값을 난수로 결정
            System.out.println("height[" + i + "]:" + height[i]);
        }

        System.out.println("최댓값은" + maxOf(height) + "입니다.");
    }
}
