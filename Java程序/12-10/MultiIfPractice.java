import java.util.Scanner;

public class MultiIfPractice{
	public static void main(String[] args){
	/*int score = (int)(100*Math.random());
	
	System.out.println(score);
	if(score>=90){
		System.out.println("优秀");
	}else if(score>=80){
		System.out.println("良好");
	}else if(score>=60){
		System.out.println("中等");
	}else{
		System.out.println("差");
	}*/
	
	
	/*System.out.println("我有多少钱");
	Scanner sc = new Scanner(System.in);
	String string_money = sc.nextLine();
	int money = Integer.parseInt(string_money);
	System.out.println(money+"万");
	if(money>500){
		System.out.println("我要买凯迪拉克");
	}else if(money>100){
		System.out.println("我要买帕萨特");
	}else if(money>50){
		System.out.println("我就买伊兰特");
	}else if(money>10){
		System.out.println("我就买奥托");
	}else{
		System.out.println("我买捷安特");
	}*/
	
	
	System.out.println("会员有多少积分");
	Scanner sc = new Scanner(System.in);
	String string_score = sc.nextLine();
	int x = Integer.parseInt(string_score);
	if(x>=8000){
		System.out.println("6折");
	}else if(x>=4000){
		System.out.println("7折");
	}else if(x>=2000){
		System.out.println("8折");
	}else{
		System.out.println("9折");
	}
	
	
	
}
} 