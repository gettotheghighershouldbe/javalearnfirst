import java.util.Scanner;
public class DoubleIfPractice{
	public static void main(String[] args){
	System.out.println("请输入您的用户名");
	Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();
	System.out.println(name);
	System.out.println("请输入您的密码");
	String code = sc.nextLine();
	System.out.println(code);
	
	
	if(name.equals("青") && code.equals("123")){
		System.out.println("欢迎您青");
	}else{
	System.out.println("对不起，您不是会员");}	
	

    System.out.println("请输入您的年龄");
	String string_age = sc.nextLine();
	System.out.println(string_age);
	System.out.println("请输入您的性别");
	String sex = sc.nextLine();
	System.out.println(sex);
	
	int age = Integer.parseInt(string_age);
	
	if(age>7 || (age>5 && sex.equals("男"))){
		System.out.println("可以搬动桌子");
	}else{
	System.out.println("暂时还搬不动哦");}

	
	}
}