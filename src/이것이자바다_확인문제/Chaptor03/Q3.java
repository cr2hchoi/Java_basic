package 이것이자바다_확인문제.Chaptor03;

public class Q3 {
    static void main() {
        int pencils = 534;
        int students = 30;
//학생 한 명이 가지는 연필 수
        int pencilsPerStudent = ( pencils / students );
        System.out.println(pencilsPerStudent);
//남은 연필 수
        int pencilsLeft = ( pencils % students );
        System.out.println(pencilsLeft);
    }
}
