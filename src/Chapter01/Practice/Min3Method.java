package Chapter01.Practice;

// 연습문제 2
public class Min3Method {

    static int min3(int a, int b, int c) {

        int min = a;

        if (min > b)
            min = b;
        if (min > c)
            min = c;

        return min;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(min3(1,2,3));
        System.out.println(min3(500,235,234));
        System.out.println(min3(-234,0,123));
    }
}
