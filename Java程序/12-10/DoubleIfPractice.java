import java.util.Scanner;
public class DoubleIfPractice{
	public static void main(String[] args){
	System.out.println("�����������û���");
	Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();
	System.out.println(name);
	System.out.println("��������������");
	String code = sc.nextLine();
	System.out.println(code);
	
	
	if(name.equals("��") && code.equals("123")){
		System.out.println("��ӭ����");
	}else{
	System.out.println("�Բ��������ǻ�Ա");}	
	

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
	System.out.println("��ʱ���᲻��Ŷ");}

	
	}
}