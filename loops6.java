public class loops6 {
    public static void main(String[] args) {
        //print reverse of a number 

        int n = 10899;

        while ( n > 0) {
            int lastDigit = n % 10;
            System.out.println(lastDigit);
            n = n / 10;
        }
        System.out.println();
            
        }
    }
    

