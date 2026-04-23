package Day05.Interface.Beverage;

public abstract class Beverage {
    //필드
    private String name;
    protected int price;

    //생성자
    public Beverage(String name) {
        this.name = name;
    }

    //추상 메소드
    abstract void calcPrice();

    //게터/세터 메소드
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    //메소드
    public void print(){

    }
}
