package javaPractice.src.CH04_ControlStatement;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("계속 진행하시겠습니까?(y/n) : ");
        String input = scan.nextLine();
        scan.close();

        switch(input){

            case "y":
                System.out.println("진행합니다...");
                break;
            case "n":
                System.out.println("종료합니다.");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
    }
}
