package Chapter01.Practice;

// 연습문제 1
public class Max4Method {

    static int max4(int a, int b, int c, int d) {

        int max = a;

        if (max < b)
            max = b;
        if (max < c)
            max = c;
        if (max < d)
            max= d;

        return max;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(max4(1,2,3,4));
        System.out.println(max4(124,4564,324,54));
        System.out.println(max4(-345,0,234234,1));
    }
}
