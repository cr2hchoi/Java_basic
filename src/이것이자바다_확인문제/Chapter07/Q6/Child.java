package 이것이자바다_확인문제.Chapter07.Q6;

public class Child extends Parent {
    public int studentNo;

    public Child(String name, int studentNo) {
        super(name); // 해결 방법: 부모 생성자를 명시적으로 호출한다.
        this.name = name;
        this.studentNo = studentNo;
    }
}