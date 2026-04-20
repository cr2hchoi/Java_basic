package Day02.Inheritance.dogCat;

import java.util.Scanner;

//Animal 상속 클래스 연습 예제
public class AnimalTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userPetName ;
        Animal myPet = null;

        System.out.println("동물 선택 : 🐶 (1) 강아지, 😸 (2) 고양이 ");
        int userPickAnimal = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기!!

        System.out.print("이름 입력: ");
        userPetName = scanner.nextLine();


        if (userPickAnimal == 1){
            myPet = new Dog(userPetName);
        } else if (userPickAnimal == 2 ){
            myPet = new Cat(userPetName);
        }

        System.out.println( userPetName + "키우기 접속중  ");
        try {
            System.out.print(userPetName + "(이) 키우기 데이터 불러오는 중: ");
            Thread.sleep(400); //0.4초 대기
            for (int i = 0; i < 5; i++) {
                System.out.print("▮"); // 한 칸씩 출력
                Thread.sleep(400);    // 0.4초 대기
            }
            System.out.println(" [로딩 완료!⭐]");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while(true){
            System.out.println(userPetName + "와 무엇을 할까요?");
            System.out.println(" 1. 밥주기 | 2. 놀아주기 | 3.  춤추기 |  4. 잠자기 |  0. 종료");
            int userChoice = scanner.nextInt();
            if (userChoice == 1) {
                myPet.eat(userPetName);
            } else if (userChoice == 2) {
                myPet.play(userPetName);
            } else if (userChoice == 3 ) {
                myPet.dance(userPetName);
            } else if (userChoice == 4) {
               myPet.sleep(userPetName);
            } else {
                System.out.println( userPetName + "(이) 키우기를 종료합니다.");
                break;
            }
        }
    }
}
