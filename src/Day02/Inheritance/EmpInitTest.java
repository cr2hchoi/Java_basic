package Day02.Inheritance;

public class EmpInitTest {
    public static void main(String[] args) {
        //vo = value object , 값만 들어있는 데이터를 얘기함
        RempVO vo1 = new RempVO("최다래",24,"010-7777-3333","2024-04-20","홍보부",false);
        vo1.deptid = "001";
        System.out.println(vo1);
    }
}
