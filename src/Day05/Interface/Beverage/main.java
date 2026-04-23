package Day05.Interface.Beverage;

public class main {
    public static void main(String[] args) {
        System.out.println("****java nara CoffeeShop영업개시****");
        Beverage[] beverage = new Beverage[5];
        beverage[0] = new Coffee("Cappuccino");
        beverage[1] = new Coffee("CafeLatte");
        beverage[2] = new Tea("ginsengTea");
        beverage[3] = new Coffee("CafeLatte");
        beverage[4] = new Tea("redginsengTea");
        getSalesInfo(beverage);

        System.out.println("총 판매 금액==>" + getTotalPrice(beverage));
        System.out.println("Coffe의 판매 개수=>" + Coffee.getAmount() + "잔");
        System.out.println("Tea의 판매 개수=>" + Tea.getAmount() + "잔");

    }
    //결과와 같이 가격을 구하고 판매정보를 출력할 수 있도록 getSalesInfo메소드를 작성하세요
    public static void getSalesInfo(Beverage[] beverage){
        for (int i = 0; i < beverage.length ; i++) {
            beverage[i].calcPrice();
            System.out.print((i+1)+"번째 판매 음료는" + beverage[i].getName()+"이며, " );
            System.out.println("가격은 " + beverage[i].price);
        }
    }

    //전체 합계 구하는 메서드
    public static int getTotalPrice(Beverage[] beverage) {
        int totalPrice = 0;
        //iter 단축어
        for (Beverage b : beverage) {
            totalPrice += b.price;
        }
        return totalPrice;
    }
}
