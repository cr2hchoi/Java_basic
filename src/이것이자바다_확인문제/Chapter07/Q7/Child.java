package 이것이자바다_확인문제.Chapter07.Q7;

public class Child extends Parent {
    public String name;
    public Child() {
        this("홍길동");
        System.out.println("Child() call");
    }
    public Child(String name) {
        this.name = name;
        System.out.println("Child(String name) call");
    }
}