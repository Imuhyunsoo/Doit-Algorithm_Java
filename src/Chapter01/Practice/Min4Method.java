package Chapter01.Practice;

// 연습문제 3
public class Min4Method {

    static int min4(int a, int b, int c, int d) {

        int min = a;

        if (min > b)
            min = b;
        if (min > c)
            min = c;
        if (min > d)
            min = d;

        return min;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(min4(1,2,3,4));
        System.out.println(min4(423,23,12,23));
        System.out.println(min4(-312,1,0,234));
    }
}
