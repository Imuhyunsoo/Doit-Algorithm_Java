package Chapter03.Example;

public class Id {

    private static int counter = 0;   // 아이디를 몇 개 부여했는지 저장
    private int id;                   // 아아디

    // 생성자
    public Id() {
        id = ++counter;
    }

    // counter 를 반환하는 클래스 메서드
    public static int getCounter() {
        return counter;
    }

    // 아이디를 반환하는 인스턴스 메서드
    public int getId() {
        return id;
    }
}
