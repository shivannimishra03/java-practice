import java.util.*;
public class conditionalSt3 {
    public static void main(String[] args) {
        
        //Else - if statement 

        int age = 13;

        if (age >= 18 ){
            System.out.println("adult");
        }
        else if (age >= 13 && age < 18) {
            System.out.println("teeneger");
        }
        else {
            System.out.println("child");
        }
    }
    
}
