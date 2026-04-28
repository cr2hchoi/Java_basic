package Day07.CommandPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //커맨드 패턴?
        Command[] commands = {
                new AddCommand(),
                new OpenCommand(),
                new PrintCommand(),
                new ExitCommand(),
        };//메뉴 추상화 하려면?


    while(true){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: Add, 2: Open, 3: Print, 4: Exit");
        System.out.println("선택: ");
        int sel = scanner.nextInt();

        commands[sel-1].execute();
    }
}
}

