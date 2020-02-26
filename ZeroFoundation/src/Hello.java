import java.util.Scanner;

public class Hello {

    public static void main(String[] args){

        System.out.println("Hello IDEA");
        Scanner in = new Scanner(System.in);
//        System.out.println("echo"+in.nextLine());
//        System.out.println(2+3+"=2+3="+(2+3));
//        System.out.println("100-23="+(100-in.nextInt()));
        int price = 0;
//        final int amount = 100;
        System.out.print("请输入票面");
        int amount = in.nextInt();
//        System.out.println(price);
        System.out.print("请输入金额");
        price = in.nextInt();
        System.out.println(amount+"-"+price+"="+(amount-price));

    }

}
