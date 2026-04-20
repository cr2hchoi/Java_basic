package Day02.Inheritance;

//
public class EmpTest {
    public static void main(String[] args) {

        RempVO vo = new RempVO();
        vo.name = "홍길동";
        System.out.println(vo.name);

        //김승리 사원의 정보는 나이 30, 전화번호 010-2222-3333 , 입사일 2010. 10. 10. 부서 : 개발부 , 결혼 여부 : 기혼
        Employee winnerKim = new Employee();
        winnerKim.name = "김승리";
        winnerKim.age = 30;
        winnerKim.phone = "010-2222-3333";
        winnerKim.empDate = "2010.10.10";
        winnerKim.dept = "개발부";
        winnerKim.marriage = true;
    }
}
