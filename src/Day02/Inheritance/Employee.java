package Day02.Inheritance;

//모든 사원들의 정보?들을 취함하는 super 클래스
public class Employee {
    //필드 선언
    String name;
    int age;
    String phone;
    String empDate;
    String dept;
    boolean marriage;

    Employee(){
        super(); //오브젝트 클래스
    }

    Employee(String name, int age, String phone, String empDate, String dept, boolean marriage){
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.empDate = empDate;
        this.dept = dept;
        this.marriage = marriage;
    }

    //art + Insert : toString 메소드 자동 변환
    //toString() 메소드? java.lang.Object 클래스에 정의된 메소드
    // 내가 만든 객체의 현재 상태를 사람(개발자)이 읽기 편한 문자로 바꾸기 위해?씀
    @Override
    public String toString() {
        return "[사원정보] 성함: " + name + " | 나이: " + age + "세 | 연락처: " + phone +
                " | 입사일: " + empDate + " | 부서: " + dept + " | 결혼: " + (marriage ? "기혼" : "미혼");

    }
}
