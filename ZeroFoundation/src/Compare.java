import java.util.Scanner;

public class Compare {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(5==5.0);
        double a = 1.0;
        double b = 0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1;
        double c = 0.5+0.5;
        double d = 0.1+0.9;
        System.out.println(a);
        System.out.println(b);
        System.out.println(Math.abs(a-b) < 1e-6);


        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a==d);


    }
}