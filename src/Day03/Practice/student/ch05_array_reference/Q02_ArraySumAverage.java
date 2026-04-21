package Day03.Practice.student.ch05_array_reference;

/*
문제 14. 2차원 배열 합계와 평균
다음 2차원 배열의 전체 합과 평균을 구하세요.

int[][] scores = {
    {90, 85},
    {88, 92, 79},
    {100, 95, 80, 70}
};

출력 예시:
총합: 679
평균: 84.875
*/
public class Q02_ArraySumAverage {
    public static void main(String[] args) {

        int sum = 0;
        int totalCount = 0;
        int[][] scores = {
                {90, 85},
                {88, 92, 79},
                {100, 95, 80, 70}
        };

        // TODO: 중첩 for문으로 총합을 구하세요.
        for (int i = 0; i < scores.length; i++) { //각 행 순회
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
//                System.out.println(sum);
                totalCount++;
            }
        }

            // TODO: 전체 개수를 세어 평균을 구하세요.
        double average = (double) sum / totalCount;
            // TODO: 결과를 출력하세요.
        System.out.println("총합: " + sum);
        System.out.printf("평균: %.2f\n" ,average);
        }
    }

