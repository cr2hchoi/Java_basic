package 이것이자바다_확인문제.Chaptor04;

public class Q2 {
    public static void main(String[] args) {
        // 기존 switch 문
        String grade = "B";
        int score1 = 0;
        switch(grade)

        {
            case "A":
                score1 = 100;
                break;
            case "B":
                int result = 100 - 20;
                score1 = result;
                break;
            default:
                score1 = 60;
        }

        // 변경된 switch 표현식..
        // switch문 변수에 바로 대입
        int score2 = switch (grade) {
            //람다식 표현
            case "A" -> 100;
            case "B" -> {
                int result = 100 - 20;
                yield result; //yield : switch용 리턴 (계산식 전용)
            }
            default -> 60;
        };


    }

}

