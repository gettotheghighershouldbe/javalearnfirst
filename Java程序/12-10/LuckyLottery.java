import java.util.Scanner;
public class LuckyLottery{
	public static void main(String[] args){
	System.out.println("欢迎登录马士兵教育抽奖系统");
	System.out.println("请输入4位会员号码");
	
	Scanner sc = new Scanner(System.in);
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
	}
		
	}
}