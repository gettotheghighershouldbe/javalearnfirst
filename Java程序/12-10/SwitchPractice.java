import java.util.Scanner;
public class SwitchPractice{
	public static void main(String[] args){
	/*Scanner sc = new Scanner(System.in);
	String string_num = sc.nextLine();
	int num = Integer.parseInt(string_num);
	System.out.println(num);
	switch(num){
		case 1:
		System.out.println("����ְֵĺ���");
		break;
		case 2:
		System.out.println("��������ĺ���");
		break;
		case 3:
		System.out.println("����үү�ĺ���");
		break;
		case 4:
		System.out.println("�������̵ĺ���");
	}*/
	
	//�Լ�������ϰ�İ汾
	/*System.out.println("�����ɻ����·�");
	Scanner sc = new Scanner(System.in);
	String string_month = sc.nextLine();
	int month = Integer.parseInt(string_month);
	System.out.println("�����ɻ��Ĳ�λ");
	String string_cabin = sc.nextLine();
	int cabin = Integer.parseInt(string_cabin);
	int price = 5000;
	if(month<=10 && month>=4){
		System.out.println("����������");
		if(cabin == 1){
			System.out.println("ͷ�Ȳջ�Ʊ�۸���"+5000*0.8);
		}else{
			System.out.println("���òջ�Ʊ�۸���"+5000*0.9);
		}
	}else{
		System.out.println("�����ǵ���");
		if(cabin == 1){
			System.out.println("ͷ�Ȳջ�Ʊ�۸���"+5000*0.4);
		}else{
			System.out.println("���òջ�Ʊ�۸���"+5000*0.5);
		}
	}*/
	
	//����д�ĸ��õİ汾������case
	System.out.println("�����ɻ����·�");
	Scanner sc = new Scanner(System.in);
	int month = sc.nextInt();
	System.out.println("�����ɻ��Ĳ�λ,1.ͷ�Ȳ�/2.���ò�");
	int seat = sc.nextInt();
	double price = 5000;
	switch(seat){
		case 1:
		if(month<=10 && month>=4){
			System.out.println("��������������ͷ�Ȳշɻ�����Ʊ�۸���"+price*0.9);
		}else{
			System.out.println("���������ǵ���ͷ�Ȳշɻ�����Ʊ�۸���"+price*0.5);
		}break;
		case 2:
		if(month<=10 && month>=4){
			System.out.println("�����������������òշɻ�����Ʊ�۸���"+price*0.8);
		}else{
			System.out.println("�����������������òշɻ�����Ʊ�۸���"+price*0.4);
		}break;
		default:
		System.out.println("��������Ч����ֵ");
		
	}
	
	
	
	}
}