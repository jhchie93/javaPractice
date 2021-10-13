package javaPractice.src.CH04_ControlStatement;

import java.util.Scanner;

public class IF {

    public static void main(String[] args) {
        int apples = 0;
        int bananas = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("사과의 갯수는 ? ");

        apples = scanner.nextInt();
        
        System.out.print("바나나의 갯수는 ? ");

        bananas = scanner.nextInt();

        scanner.close();

        if(apples > bananas){
            System.out.println("사과과 바나나보다 많다.");
        }
        else if(bananas > apples){
            System.out.println("바나나가 사과보다 많다.");
        }
        else{
            System.out.println("두 과일의 수가 같다.");
        }
    }
}
