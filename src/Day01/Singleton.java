package Day01;

//싱글톤 객체에 대해서 인스턴스를 getter로 참조하는 예제 코드입니다.
public class Singleton {
    //final로 싱글톤 객체 선언( 추가 및 변경 불가 )
    private static final Singleton singleton = new Singleton();
    //private 접근 권한을 갖는 생성자 선언
    private Singleton(){
    }

    //public 접근 권한을 갖는 정적 메소드 선언
    public static Singleton getInstance() {
        return singleton;
    }

}
