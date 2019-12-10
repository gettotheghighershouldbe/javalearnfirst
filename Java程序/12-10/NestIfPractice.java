import java.util.Scanner;
public class NestIfPractice{
	public static void main(String[] args){
	//普通客户购物满100元打9折；会员购物打8折；会员购物满200元打7.5折。
	System.out.println("客户此次购物的金额为：");
	Scanner sc = new Scanner(System.in);
	String string_money = sc.nextLine();
	int money = Integer.parseInt(string_money);
	System.out.println(money);
	System.out.println("客户的身份为：会员/非会员");
	String status = sc.nextLine();
	System.out.println(status);
	
	if(money>=100){
		System.out.println("普通客户实际结账金额为"+(money*0.9));
	if(status.equals("会员")){
		System.out.println("会员客户实际结账金额为"+(money*0.8));
	if(money>=200){
	System.out.println("会员客户超过200实际结账金额为"+(money*0.75));}}
	}else{
		System.out.println("购物金额为"+money);
	}
	
	
	}
}