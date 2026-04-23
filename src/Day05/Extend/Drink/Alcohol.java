package Day05.Extend.Drink;

public class Alcohol extends Drink {
    float alcper;

    public Alcohol(String name, int price, int count, float alcper) {
        super(name, price, count);
        this.alcper = alcper;
    }

    @Override
    public void printTitle() {
        System.out.print("상품명(도수[%])\t단가\t\t수량\t\t금액");
        System.out.println();
    }

    @Override
    public void printData() {
        System.out.print(this.name+"("+this.alcper+")"+ "\t\t");
        System.out.print(this.price + "\t");
        System.out.print(this.count + "\t\t");
        getTotalPrice();
        System.out.println(this.totalPrice);
    }
}
