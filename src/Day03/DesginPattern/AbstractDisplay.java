package Day03.DesginPattern;

public abstract class AbstractDisplay {
    public abstract void open();
    public abstract void print();
    public abstract void close();

    //AbstractDisplay 에서 구현하는 메서드
    public final void display(){ //템플릿
        open();
        for (int i=0 ; i<5; i++){
            print();
        }
        close();
    }
}
