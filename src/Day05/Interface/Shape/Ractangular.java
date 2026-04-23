package Day05.Interface.Shape;

public class Ractangular extends Shape {
    private double width;
    private String height;

    public Ractangular(String name, double width, String height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    void calculationArea() {
        super.area = width*Double.parseDouble(height);
    }

    @Override
    public void print() {
        super.print();
        System.out.printf("%,.1f\n", super.area);
    }
}
