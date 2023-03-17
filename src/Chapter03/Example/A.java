package Chapter03.Example;

// 실습 3C-2 : 자연 정렬을 하려면 다음과 같은 패턴으로 클래스를 정의
public class A implements Comparable<A> {

    @Override
    public int compareTo(A c) {

        // this 가 c보다 크면 양의 값 반환
        // this 가 c보다 작으면면 음의 값 반환
        // this 가 c와 같으면 0 값 반환
        return 0;
    }

    @Override
    public boolean equals(Object c) {

        // this 가 c와 같으면 true 반환
        // this 가 c와 갗지 않으면 false 반환
        return super.equals(c);
    }
}
