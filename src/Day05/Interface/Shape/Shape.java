package Day05.Interface.Shape;

public abstract class Shape {
    //필드 선언
    public double area;
    private String name;

    //생성자
    public Shape(){};
    public Shape(String name) {
        this.name = name;
    }

    //추상 메서드
    abstract void calculationArea();

    //메서드
    public void print(){
        System.out.print(name+"의 면적은 ");
    }

}
