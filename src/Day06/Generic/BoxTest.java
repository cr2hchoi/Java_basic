package Day06.Generic;

class Box<T> {
    private T height;
    private T width;
    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}

//박스에 넣을 인형들 클래스
class Doll{
    String type = "바비인형";

};
public class BoxTest {
    public static void main(String[] args) {
        Doll 인형 = new Doll();
        Box<Doll> box = new Box<Doll>();
        box.setContent(인형);
        System.out.println(box.getContent().type);
    }
}