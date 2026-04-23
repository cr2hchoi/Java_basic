package Day05.Extend.Student;

public class Student {
    private String name;
    private String subject;
    private int fee;
    private double returnFee;

    public Student(String name, String subject, int fee) {
        this.name = name;
        this.subject = subject;
        this.fee = fee;
    }

    //환급금 계산 메소드
    public void calcReturnFee(){
        if( "javaprogram".equals(subject)){
            returnFee = fee*0.25;
        }else if("jspprogram".equals(subject)){
            returnFee = fee*0.2;
        }else{
            System.out.println("그런 과정명은 없습니다.");
        }
    }

    //student 정보 출력 메소드
    public void print(){
        String feeStr = String.format("%, d", fee);
        String returnFeeStr = String.format("%,.0f", returnFee);

        System.out.println(name + "씨의 과정명은 " + subject + "이고 교육비는 " + feeStr + "원이며 환급금은 " + returnFeeStr + "원입니다");
    }

    public static void main(String args[]){
        Student stu = new Student("차은우", "jspprogram",
                500000);
        stu.calcReturnFee();
        stu.print();
    }
}
