import java.util.Scanner;
public class LuckyLottery{
	public static void main(String[] args){
	System.out.println("��ӭ��¼��ʿ�������齱ϵͳ");
	System.out.println("������4λ��Ա����");
	
	Scanner sc = new Scanner(System.in);
	String number = sc.nextLine();
	int k = Integer.parseInt(number);
	int j = k/100%10;
	int i = (int)(Math.random()*10);
	System.out.println(j);
	System.out.println(i);
	
	
	if (i != j){
		System.out.println(j+",лл֧��");
	}
	else{
		System.out.println("��ϲ�н�");
	}
		
	}
}