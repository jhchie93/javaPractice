package javaPractice.src.CH03_Strings;

public class Printing {

    public static void main(String[] args) {

        System.out.println("=========================");
        System.out.println("\t탭\t만큼 뛰웁니다.");
        System.out.println("=========================");
        System.out.println("자바를\n배우고\n있습니다.");
        System.out.println("=========================");

        System.out.print("print는 ");
        System.out.print("줄을 띄우지 않습니다.");


        int age = 25;
        String addr = "부산";

        System.out.printf("내 나이는 %d살 입니다.\n", age);
        System.out.printf("내 나이는 %d살 이고 %S에 살고 있습니다..\n", age, addr);

        double pi = 3.14592;
        System.out.printf("파이의 값은 : %.2f", pi);
    }
    
}
