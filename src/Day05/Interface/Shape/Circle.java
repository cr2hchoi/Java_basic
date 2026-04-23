package Day05.Interface.Shape;

public class Circle extends Shape{
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    void calculationArea() {
        super.area = radius*radius*Math.PI;
    }

    @Override
    public void print() {
        super.print();
        System.out.printf( "%,.13f\n",super.area);
    }
}
