package Chapter01.Practice;

// 연습문제 8
public class SumOfMethod {

    static int sumof(int a, int b) {

        int sum = 0;

        for(int i = Math.min(a, b); i <= Math.max(a, b); i++) {

            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(sumof(3,5));
        System.out.println(sumof(6,4));
    }
}
