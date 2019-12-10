
import java.util.Scanner;

public class AddCust{
	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);
	
	/*System.out.println("请输入会员号码<4位整数>");
	String number = sc.nextLine();
	System.out.println(number);
	System.out.println("请输入会员生日（月/日<用两位整数表示>）");
	String birthday = sc.nextLine();
	System.out.println(birthday);
	System.out.println("请输入积分");
	String score = sc.nextLine();
	System.out.println(score);
	
	if (number.length()==4){
		System.out.println("有搞手");
	} 
	else{
		System.out.println("搞错哒，重来");
	}*/
	
	/*System.out.println("欢迎登录马士兵教育抽奖系统");
	System.out.println("请输入4位会员号码");
	
	
	String number = sc.nextLine();
	int k = Integer.parseInt(number);
	int j = k/100%10;
	int i = (int)(Math.random()*10);
	System.out.println(j);
	System.out.println(i);
	
	
	if (i != j){
		System.out.println(j+",谢谢支持");
	}
	else{
		System.out.println("恭喜中奖");
	}*/
	
	
	/*System.out.println("请输入您的用户名");
	String name = sc.nextLine();
	System.out.println(name);
	System.out.println("请输入您的密码");
	String code = sc.nextLine();
	System.out.println(code);
	
	
	if(name.equals("青") && code.equals("123")){
		System.out.println("欢迎您青");
	}else{
		System.out.println("对不起，您不是会员");
	}*/
	
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
		System.out.println("暂时还搬不动哦");
	}
	
	
	
	
	
	
	}
}