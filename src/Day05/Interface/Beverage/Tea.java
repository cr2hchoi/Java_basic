package Day05.Interface.Beverage;

public class Tea extends Beverage{
    private static int amount;

    public Tea(String name) {
        super(name);
        amount++;
    }

    public static int getAmount() {
        return amount;
    }

    public static void setAmount(int amount) {
        Tea.amount = amount;
    }

    @Override
    void calcPrice() {
        if ("LemonTea".equals(getName())){
            super.price = 1500;
        } else if ("ginsengTea".equals(getName())){
            super.price = 2000;
        } else if ("redginsengTea".equals(getName())){
            super.price = 2500;
        }
    }


}
