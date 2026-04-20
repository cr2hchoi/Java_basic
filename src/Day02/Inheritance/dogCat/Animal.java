package Day02.Inheritance.dogCat;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }


    void hello(String name){
        this.name = name;
        System.out.println(name + "(이)가 반갑다고 인사해요!");
    };

    public void eat(String name){
        this.name = name;
        System.out.println(name + "아 밥먹자!");
    };
    public void play(String name){
        this.name = name;
        System.out.println(name + "이와 어떻게 놀아줄까요?");
    };
    public void sleep(String name){
        this.name = name;
        System.out.println(name + ": z..zZ... ");
    };
    public void dance(String name){
        this.name = name;
        System.out.println(name + "야(아) 춤추자! ");
    };

}
