package Day02.Inheritance;

//Emplyee 클래스를 상속하는 자식 클래스
public class RempVO extends Employee{
    public String deptid; //부서 코드

    RempVO(){
        super(); //부모 생성자 호출
    } // 기본생성자

    RempVO(String name, int age, String phone, String empDate,String dept, boolean marriage){
        //생성자 오버로딩 필요
        super(name, age, phone, empDate, dept, marriage);

    }

    @Override
    public String toString() {
        // 부모의 toString 결과물 뒤에 자식 데이터 연결
        return super.toString() + " | 부서코드 : " + deptid;
    }
}
