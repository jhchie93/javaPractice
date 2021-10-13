package javaPractice.src.CH03_Strings;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double celsius = 0;
        double fahrenheit = 0;

        System.out.print("온도를 입력해주세요. : ");

        celsius = scanner.nextDouble();
        fahrenheit = (celsius * 9/5) + 32;

        scanner.close();

        System.out.println("섭씨 " + celsius + "는 화씨" + fahrenheit + "이다.");
    }
    
}
