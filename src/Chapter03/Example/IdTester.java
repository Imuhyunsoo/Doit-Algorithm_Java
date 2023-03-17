package Chapter03.Example;

// 실습 3C-1 : 아이디를 부여하는 클래스
public class IdTester {

    public static void main(String[] args) {

        Id a = new Id();   // 아이디 1
        Id b = new Id();   // 아이디 2

        System.out.println("a의 아이디: " + a.getId());
        System.out.println("b의 아이디: " + b.getId());

        System.out.println("부여한 아이디의 개수: " + Id.getCounter());
    }
}
