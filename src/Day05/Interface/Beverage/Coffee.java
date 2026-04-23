package Day05.Interface.Beverage;

public class Coffee extends Beverage {
    static int amount;

    public Coffee(String name) {
        super(name);
        amount++;
    }

    public static int getAmount() {
        return amount;
    }

    public static void setAmount(int amount) {
        Coffee.amount = amount;
    }

    @Override
    void calcPrice() {
        if ("Americano".equals(getName())){
            super.price = 1500;
        } else if ("CafeLatte".equals(getName())){
            super.price = 2500;
        } else if ("Cappuccino".equals(getName())){
            super.price = 3000;
        } else {
            System.out.println("안파는 메뉴");}
    }
}
