package Chapter03.Practice;

import java.util.Scanner;

// 연습문제 2 : 오른쪽처럼 선형 검색의 스캐닝 과정을 자세히 출력하는 프로그램을 작성하세요.
//            이때 각 행의 맨 왼쪽에 현재 선택한 요소의 인덱스를 출력하고,현재 선택한 요소 위에 기호 *를 출력하세요

/***
 *    | 0 1 2 3 4 5 6 7
 * ---+--------------------
 *    | *
 *   0| 6 4 3 2 1 9 8 3
 *    |   *
 *   1| 6 4 3 2 1 9 8 3
 *    |     *
 *   2| 6 4 3 2 1 9 8 3
 * 그 값은 x[2]에 있습니다.
 ***/
public class SeqSearchSenPrint {

    // 요솟수가 n인 배열 a에서 key 와 값이 같은 요소를 보초법으로 선형 검색
    static int seqSearch(int a[], int n, int key) {

        int i;             // 보초를 추가

        a[n] = key;
        System.out.print("   " + "| ");
        for (int j = 0; j < a.length; j++) {
            System.out.print(j + " ");
        }System.out.println();
        System.out.println("---+--------------------");

        for (i = 0; i < a.length + 1; i++) {
            System.out.println("   " + "| " + "  ".repeat(i) + "*");
            System.out.print("  " + i + "|");
            for (int j = 0; j < a.length; j++) {
                System.out.print(" " + a[j]);
            }System.out.println();
            if (a[i] == key)   // 검색 성공
                break;
        }
        return i == n ? -1 : i;
    }

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = stdIn.nextInt();
        int[] x = new int[num + 1];        // 요솟수가 num + 1인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색할 값: ");    // 키값을 입력받음
        int ky = stdIn.nextInt();
        int idx = seqSearch(x, num, ky);   // 배열 x에서 값이 ky인 요소를 검색

        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
    }
}
