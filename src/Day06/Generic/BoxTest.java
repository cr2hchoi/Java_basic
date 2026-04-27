package Day06.Generic;

//박스에 넣을 인형들 클래스
class Doll{
    String type = "바비인형";

};
public class BoxTest {
    public static void main(String[] args) {
        Doll 인형 = new Doll();
        //인형 클래스를 타입으로 넘겨줘서 Doll클래스의 객체만 넣을 수 있음
        Box<Doll> box = new Box<Doll>();
        box.setContent(인형);
        System.out.println(box.getContent().type);

        Box box1 = new Box();
        Box box2 =new Box();

        box1.setContent() = 100;
        box2.setContent() = "200";
        boolean r1 = box1.compare(box1,box2);


    }
}