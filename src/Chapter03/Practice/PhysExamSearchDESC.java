package Chapter03.Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// 연습문제 7 : 실습 3-8를 수정하여 시력을 내림차순으로 정렬한 신체검사 데이터에서 특정 시력을 가진사람을 검색하는 프로그램을 작성하세요.
class PhysExamSearchDESC {

    // 신체검사 데이터를 정의
    static class PhyscData {

        private String name;     // 이름
        private int height;      // 키
        private double vision;   // 시력

        // 생성자
        public PhyscData(String name, int height, double vision) {

            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        // 문자열로 만들어 반환하는 메서드
        public String toString() {
            return name + " " + height + " " + vision;
        }

        // 키의 오름차순으로 정렬하기 위한 comparator
        public static final Comparator<PhyscData> VISION_ORDER = new VisionOderComparator();

        private static class VisionOderComparator implements Comparator<PhyscData> {

            @Override
            public int compare(PhyscData d1, PhyscData d2) {
                return Double.compare(d1.vision, d2.vision);
            }
        }
    }

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        PhyscData[] x = {
                new PhyscData("강민하", 162, 0.3),
                new PhyscData("이수연", 168, 0.4),
                new PhyscData("황지안", 169, 0.8),
                new PhyscData("유서범", 171, 1.5),
                new PhyscData("김찬우", 173, 0.7),
                new PhyscData("장경오", 174, 1.2),
                new PhyscData("박준서", 175, 2.0),
        };

        System.out.print("시력이 몇 인 사람을 찾고 있나요?: ");
        double vision = stdIn.nextDouble();
        int idx = Arrays.binarySearch(x, new PhyscData("", 0, vision), PhyscData.VISION_ORDER);

        if (idx < 0)
            System.out.println("그 값의 요소가 없습니다.");
        else {
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
            System.out.println("찾는 데이터: " + x[idx]);
        }
    }
}
