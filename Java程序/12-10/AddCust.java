
import java.util.Scanner;

public class AddCust{
	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);
	
	/*System.out.println("�������Ա����<4λ����>");
	String number = sc.nextLine();
	System.out.println(number);
	System.out.println("�������Ա���գ���/��<����λ������ʾ>��");
	String birthday = sc.nextLine();
	System.out.println(birthday);
	System.out.println("���������");
	String score = sc.nextLine();
	System.out.println(score);
	
	if (number.length()==4){
		System.out.println("�и���");
	} 
	else{
		System.out.println("����գ�����");
	}*/
	
	/*System.out.println("��ӭ��¼��ʿ�������齱ϵͳ");
	System.out.println("������4λ��Ա����");
	
	
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
	}*/
	
	
	/*System.out.println("�����������û���");
	String name = sc.nextLine();
	System.out.println(name);
	System.out.println("��������������");
	String code = sc.nextLine();
	System.out.println(code);
	
	
	if(name.equals("��") && code.equals("123")){
		System.out.println("��ӭ����");
	}else{
		System.out.println("�Բ��������ǻ�Ա");
	}*/
	
	System.out.println("��������������");
	String string_age = sc.nextLine();
	System.out.println(string_age);
	System.out.println("�����������Ա�");
	String sex = sc.nextLine();
	System.out.println(sex);
	
	int age = Integer.parseInt(string_age);
	
	if(age>7 || (age>5 && sex.equals("��"))){
		System.out.println("���԰ᶯ����");
	}else{
		System.out.println("��ʱ���᲻��Ŷ");
	}
	
	
	
	
	
	
	}
}