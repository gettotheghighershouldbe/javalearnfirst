import java.util.Scanner;
public class NestIfPractice{
	public static void main(String[] args){
	//��ͨ�ͻ�������100Ԫ��9�ۣ���Ա�����8�ۣ���Ա������200Ԫ��7.5�ۡ�
	System.out.println("�ͻ��˴ι���Ľ��Ϊ��");
	Scanner sc = new Scanner(System.in);
	String string_money = sc.nextLine();
	int money = Integer.parseInt(string_money);
	System.out.println(money);
	System.out.println("�ͻ������Ϊ����Ա/�ǻ�Ա");
	String status = sc.nextLine();
	System.out.println(status);
	
	if(money>=100){
		System.out.println("��ͨ�ͻ�ʵ�ʽ��˽��Ϊ"+(money*0.9));
	if(status.equals("��Ա")){
		System.out.println("��Ա�ͻ�ʵ�ʽ��˽��Ϊ"+(money*0.8));
	if(money>=200){
	System.out.println("��Ա�ͻ�����200ʵ�ʽ��˽��Ϊ"+(money*0.75));}}
	}else{
		System.out.println("������Ϊ"+money);
	}
	
	
	}
}