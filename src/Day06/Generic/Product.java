package Day06.Generic;

public class Product <K,M> {
    //필드
    private K kind;
    private M model; //타입 파랑미터를 필드타입으로 선언


    public K getKind(){
        return kind;
    };

    public M getModel() {
        return model;
    }

    public void setKind(K kind){
        this.kind = kind;
    }
    public void setModel(M model) {
        this.model = model;
    }

}

class Radio {
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

class Tv{
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Tv{" ;
    }
}
