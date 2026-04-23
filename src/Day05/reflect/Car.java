package Day05.reflect;

//멤버 정보 읽기 에제 코드
public class Car {
    //필드
    private String medel;
    private String owner;

    //생성자
    public Car(){};
    public Car(String model){
        this.medel = model;
    }

    //Getter&Setter
    public String getMedel() {
        return medel;
    }

    public void setMedel(String medel) {
        this.medel = medel;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
