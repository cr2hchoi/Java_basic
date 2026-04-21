package Day03.Practice.student.ch04_control;

/*
문제 12. 중첩 for문
다음과 같이 별이 출력되도록 코드를 작성하세요.

출력 결과:
*
**
***
****
*****
*/
public class Q04_StarTriangle {
    public static void main(String[] args) {
        // TODO: 중첩 for문으로 별 삼각형을 출력하세요.
       printTriangle(5);

    }

    private static void printTriangle(int height){
        for (int row = 1; row <= height ; row++){ //행 선언 (높이만큼 행 추가)
            for (int column = 1 ; column <= row ; column++) { //행을 쪼개는 열 추가 (열에 별을 찍는데, 행에 따라서 찍히게)
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈 ;
        }
    }
}
