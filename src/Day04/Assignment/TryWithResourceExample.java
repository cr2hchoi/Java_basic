package day06.ch11.sec04;

public class TryWithResourceExample {
    public static void main(String[] args) {
        try (ch11.sec04.MyResource res = new ch11.sec04.MyResource("A")) {
            String data = res.read1();
            int value = Integer.parseInt(data);
        } catch(Exception e) {
            System.out.println("예외 처리: " + e.getMessage());
        }

        System.out.println();

        try (ch11.sec04.MyResource res = new ch11.sec04.MyResource("A")) {
            String data = res.read2();
            //NumberFormatException 발생
            int value = Integer.parseInt(data);
        } catch(Exception e) {
            System.out.println("예외 처리: " + e.getMessage());
        }

        System.out.println();

        ch11.sec04.MyResource res1 = new ch11.sec04.MyResource("A");
        ch11.sec04.MyResource res2 = new ch11.sec04.MyResource("B");
        try (res1; res2) {
            String data1 = res1.read1();
            String data2 = res2.read1();
        } catch(Exception e) {
            System.out.println("예외 처리: " + e.getMessage());
        }
    }
}