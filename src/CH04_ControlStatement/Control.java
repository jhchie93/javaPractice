package javaPractice.src.CH04_ControlStatement;

public class Control {

    public static void main(String[] args) {
        
        int counter = 0;
        int sum=0;

        for(counter = 1; counter <= 100; counter++){

            sum += counter;
        }

        System.out.println(sum);
    }
}
