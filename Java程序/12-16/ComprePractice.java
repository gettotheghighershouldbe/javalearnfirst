import java.util.Scanner;

public class ComprePractice{
	public static void main(String[] args){
	//循环录入会员信息
	System.out.println("****************");
	System.out.println("添加客户信息");
	System.out.println("****************");
	Scanner sc = new Scanner(System.in);
	String number;
	String birth;
	int score;
	
	for(int i = 1;i<=3;i++){ 
	System.out.println("请输入会员号：");
	number = sc.next();
	
	System.out.println("请输入会员生日（月/日<用两位整数表示>）：");
	birth = sc.next();
	
	System.out.println("请输入会员积分");
	score = sc.nextInt();
	int length = number.length();
	
	if(length != 4){
		
		System.out.println("录入信息失败");
		continue;
	}
	System.out.println("您录入的会员信息是");
	System.out.println(number+"\t"+birth+"\t"+score);
	}
	
	System.out.println("程序结束");
	}
}