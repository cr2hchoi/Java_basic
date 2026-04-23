package Day05.Extend.Drink;


public class Drink {
    //필드 선언
    String name;
    int price;
    int count;
    int totalPrice;
    
    //생성자
    public Drink(){
    };

    public Drink(String name, int price, int count){
        this.name = name;
        this.price = price;
        this.count = count;
    }

    //금액(단가*수량) 계산 메서드
    public int getTotalPrice(){
        totalPrice = price * count;
        return totalPrice;
    }

    //타이틀 출력하는 메소드
    public void printTitle(){
        System.out.println("상품명\t\t\t단가\t\t수량\t\t금액");
    }

    //상품 정보 출력 메서드
    public void printData(){
        System.out.print(this.name + "\t\t\t\t");
        System.out.print(this.price + "\t");
        System.out.print(this.count + "\t\t");
        getTotalPrice();
        System.out.println(this.totalPrice);
    }



}
