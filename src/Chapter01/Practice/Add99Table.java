package Chapter01.Practice;

// 연습문제 11
public class Add99Table {

    public static void main(String[] args) {

        // 첫번째 줄
        System.out.printf("%4s","|");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%3d", i);
        } System.out.println();

        // 두번째 줄
        System.out.println("---+---------------------------");


        for (int i = 1; i <= 9; i++) {
            // 세로 줄
            System.out.printf("%2d %s",i,"|");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3d", i + j);
            }
            System.out.println();
        }
    }
}
