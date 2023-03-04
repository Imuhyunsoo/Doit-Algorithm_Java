package Chapter02.Practice;

// 연습문제 8 : 오른쪽처럼 년원일을 필드로 갖는 클래스를 만드세요. 다음과 같이 생성자와 메서드를 정의해야 합니다.

/***
 * 생성자(주어진 날짜로 설정)
 * YMD(int y, int m, int d)

 * n일 뒤의 날짜를 반환
 * YMD after(int n)

 * n일 앞의 날짜를 반환
 * YMD before(int n)
 ***/
public class YMD {

    int y;   // 년
    int m;   // 월(1 ~ 12)
    int d;   // 일(1 ~ 31)

    YMD(int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    int after(int n) {

        return (d + n >= 32) ? 31 : n;
    }

    int before(int n) {

        return (d - n <= 0) ? 1 : n;
    }
}
