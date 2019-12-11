import java.util.Scanner;
public class SwitchPractice{
	public static void main(String[] args){
	/*Scanner sc = new Scanner(System.in);
	String string_num = sc.nextLine();
	int num = Integer.parseInt(string_num);
	System.out.println(num);
	switch(num){
		case 1:
		System.out.println("拨打爸爸的号码");
		break;
		case 2:
		System.out.println("拨打妈妈的号码");
		break;
		case 3:
		System.out.println("拨打爷爷的号码");
		break;
		case 4:
		System.out.println("拨打奶奶的号码");
	}*/
	
	//自己做的练习的版本
	/*System.out.println("乘坐飞机的月份");
	Scanner sc = new Scanner(System.in);
	String string_month = sc.nextLine();
	int month = Integer.parseInt(string_month);
	System.out.println("乘坐飞机的舱位");
	String string_cabin = sc.nextLine();
	int cabin = Integer.parseInt(string_cabin);
	int price = 5000;
	if(month<=10 && month>=4){
		System.out.println("现在是旺季");
		if(cabin == 1){
			System.out.println("头等舱机票价格是"+5000*0.8);
		}else{
			System.out.println("经济舱机票价格是"+5000*0.9);
		}
	}else{
		System.out.println("现在是淡季");
		if(cabin == 1){
			System.out.println("头等舱机票价格是"+5000*0.4);
		}else{
			System.out.println("经济舱机票价格是"+5000*0.5);
		}
	}*/
	
	//别人写的更好的版本，用了case
	System.out.println("乘坐飞机的月份");
	Scanner sc = new Scanner(System.in);
	int month = sc.nextInt();
	System.out.println("乘坐飞机的舱位,1.头等舱/2.经济舱");
	int seat = sc.nextInt();
	double price = 5000;
	switch(seat){
		case 1:
		if(month<=10 && month>=4){
			System.out.println("您乘坐的是旺季头等舱飞机，机票价格是"+price*0.9);
		}else{
			System.out.println("您乘坐的是淡季头等舱飞机，机票价格是"+price*0.5);
		}break;
		case 2:
		if(month<=10 && month>=4){
			System.out.println("您乘坐的是旺季经济舱飞机，机票价格是"+price*0.8);
		}else{
			System.out.println("您乘坐的是旺季经济舱飞机，机票价格是"+price*0.4);
		}break;
		default:
		System.out.println("请输入有效的数值");
		
	}
	
	
	
	}
}