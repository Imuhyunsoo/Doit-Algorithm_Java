package Chapter03.Practice;

import java.util.Scanner;

// 연습문제 1 : 실습 3-3의 seqSearchSen 메소드를 while 문 대신 for 문을 사용하여 수정한 프로그램을 작성하세요.
public class SeqSearchSenFor {

    // 요솟수가 n인 배열 a에서 key 와 값이 같은 요소를 보초법으로 선형 검색
    static int seqSearch(int a[], int n, int key) {

        int i;             // 보초를 추가

        a[n] = key;

        for (i = 0; i < a.length + 1; i++) {
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
