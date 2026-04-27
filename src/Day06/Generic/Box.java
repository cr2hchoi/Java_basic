package Day06.Generic;

//어떤 물건이든 담을 수 있는 박스 클래스
public class Box<T> {
    private T height;
    private T width;
    private T content;

    public T getContent() {
        return content;
    }
    public void setContent(T content) {
        this.content = content;
    }

    //박스에 담긴 내용물이 같은 물건인지 판단하는 기능
    public boolean compare(Box<T> other){
        boolean result = content.equals(other.content);
        return result;
    };
}
