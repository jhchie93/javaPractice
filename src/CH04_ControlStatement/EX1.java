package javaPractice.src.CH04_ControlStatement;

import java.util.Scanner;

public class EX1 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("메뉴");
        System.out.println("1. 프린트 '헬로우'");
        System.out.println("2. 프린트 '안녕'");
        System.out.println("3. 프로그램 종료");

        System.out.print("옵션을 선택 > ");

        int input = scan.nextInt();
        scan.close();

        /*
        if(input==1){
            System.out.println("헬로우");
        }
        else if(input==2){
            System.out.println("안녕");
        }
        else if(input==3){
            System.out.println("종료합니다...");
        }
        else{
            System.out.println("잘못된 값을 입력했습니다.");
        }
        */
        switch(input){

            case 0:
                System.out.println("헬로우");
                break;
            case 1:
                System.out.println("안녕");
                break;
            case 3:
                System.out.println("프로그램 종료");
                break;
            default:
                System.out.println("잘못된 값을 입력했습니다.");
        }
        
    }
    
}
