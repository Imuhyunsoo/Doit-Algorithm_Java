package Chapter03.Example;

import java.util.Scanner;

// 실습 3-2 : 선형 검색(For)
public class SeqSearchFor {

    // 요솟수가 n인 배열 a에서 key 와 값이 같은 요소를 선형 검색
    static int seqSearch(int a[], int n, int key) {
        for (int i = 0; i < n; i++)
            if (a[i] == key)
                return 1;   // 검색 성공(인덱스를 반환)
        return -1;          // 검색 실패 (=1을 반환)
    }

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = stdIn.nextInt();
        int[] x = new int[num];           // 요솟수가 num 인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색할 값: ");   // 키값을 입력받음
        int ky = stdIn.nextInt();
        int idx = seqSearch(x, num, ky);

        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
    }
}
