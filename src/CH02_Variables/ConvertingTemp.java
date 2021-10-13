package javaPractice.src.CH02_Variables;

public class ConvertingTemp {
    
    public static void main(String[] args) {
        //섭씨 Celsius -> 화씨 Fahrenheit

        double celsius = 25;
        double fahrenheit = 0;

        fahrenheit = (celsius * 9/5) + 32;

        System.out.println("섭씨 " + celsius + "는 화씨" + fahrenheit + "이다.");
    }
}
