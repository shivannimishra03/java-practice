import java.util.Scanner;

public class loops2 {
    public static void main(String[] args) {
        //print number from 1 to n
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter = 1;

        while (counter <= range) {
            System.out.println(counter + " ");
            counter++;
        }
        System.out.println();
    }
    
}
