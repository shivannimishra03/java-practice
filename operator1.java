public class operator1 {
    public static void main(String[] args) {
        //Unary operator 
        int a = 10;
        int b = ++a;   //pre-increment
        System.out.println(a);
        System.out.println(b);

        int c = 12;
        int d = c++;   //post-increment
        System.out.println(c);
        System.out.println(d);

        int e = 10;
        int f = --a;   //pre-decrement 
        System.out.println(e);
        System.out.println(f);

        int g = 10;
        int h = a--;   //post-decrement
        System.out.println(g);
        System.out.println(h);
    }
    
}
