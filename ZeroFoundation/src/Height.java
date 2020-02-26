import java.util.Scanner;

public class Height {

    public static void main(String[] args){

        int foot;
        double inch;
        System.out.println(1.2-1.1);
        Scanner in = new Scanner(System.in);
        foot = in.nextInt();
        inch = in.nextDouble();
        System.out.println("foot="+foot+","+"inch="+inch);
//        System.out.println((foot+inch/12)*0.3048);两个整型的变量相除结果只能是整型
        System.out.println((foot+inch/12)*0.3048);
        System.out.print(10/3);

    }

}
