import java.util.Scanner;

public class loops3 {
    public static void main(String[] args) {
        //print sum of first n natural numbers
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("sum is : " + sum);
    }
    
}
