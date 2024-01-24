import java.util.Scanner;

public class conditionalSt2 {
    public static void main(String[] args) {
        
        //Print if a number is odd or even

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }
    
}
