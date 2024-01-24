import java.util.*;
public class practiceQ2 {
    
    public static void main(String[] args) {
        /*
        Question2 : In a program, input the side of a square. You have to output the area of the square.
        (Hint : area of a square is (side x side))
         */
        Scanner sc = new Scanner(System.in); 
        int side = sc.nextInt(); 
        int area = side * side;
        System.out.println("area of the square is :"+ area);

    }
}
