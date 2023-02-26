package Chapter01.Practice;

// 연습문제 4
public class Med3Method {

    /***
     * 연습문제 5
     * 중앙값을 구하는 메서드는 다음과 같이 작성할 수도 있습니다. 그러나 실습 1C-1 med 메서드에 비해 효율이 떨어지는데 그 이유를 설명하세요.
     * 이유 : 실습에서 사용한 메소드 방식은 if 문에서 식 하나씩 실행해서 조건을 빠르게 찾는 즉시 루프를 탈출하여 결과값을 출력하지만,
             AND,OR 방식을 사용하게 되면 식 전체가 맞을때까지 조건을 확인하기 때문에 불필요한 코스트 낭비가 생길 수 있다.

    static int med3(int a, int b, int c) {
        if((b >= a && c <= a) || (b <= a && c >= a))
            return a;
        else if((a > b && c < b) || (a < b && c > b))
            return b;
        return c;
    }*/

    static int med3(int a, int b, int c) {

        if (a >= b)
            if (b >= c)
                return b;
            else if (a <= c)
                return a;
            else
                return c;
        else if (a > c)
            return a;
        else if (b > c)
            return c;
        else
            return b;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(med3(1,2,3));
        System.out.println(med3(500,255,25));
        System.out.println(med3(-50,0,35));
    }
}
