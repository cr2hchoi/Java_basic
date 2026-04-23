package Day05.Interface.Shape;

public class TestShape {
    public static void main(String[] args) {
        Shape circle = new Circle("원",10);
        Shape ractangular = new Ractangular("직사각형",2,"10");
        circle.calculationArea();
        ractangular.calculationArea();
        circle.print();
        ractangular.print();

        Shape [] shape = new Shape[2];
        shape[0] = new Circle("원2",10);
        shape[1] = new Ractangular("직사각형2", 2, "10");
        for (Shape shape1 : shape) {
            shape1.calculationArea();
            shape1.print();
        }
    }
}
