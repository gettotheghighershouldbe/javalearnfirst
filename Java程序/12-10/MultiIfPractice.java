import java.util.Scanner;

public class MultiIfPractice{
	public static void main(String[] args){
	/*int score = (int)(100*Math.random());
	
	System.out.println(score);
	if(score>=90){
		System.out.println("����");
	}else if(score>=80){
		System.out.println("����");
	}else if(score>=60){
		System.out.println("�е�");
	}else{
		System.out.println("��");
	}*/
	
	
	/*System.out.println("���ж���Ǯ");
	Scanner sc = new Scanner(System.in);
	String string_money = sc.nextLine();
	int money = Integer.parseInt(string_money);
	System.out.println(money+"��");
	if(money>500){
		System.out.println("��Ҫ�򿭵�����");
	}else if(money>100){
		System.out.println("��Ҫ��������");
	}else if(money>50){
		System.out.println("�Ҿ���������");
	}else if(money>10){
		System.out.println("�Ҿ������");
	}else{
		System.out.println("����ݰ���");
	}*/
	
	
	System.out.println("��Ա�ж��ٻ���");
	Scanner sc = new Scanner(System.in);
	String string_score = sc.nextLine();
	int x = Integer.parseInt(string_score);
	if(x>=8000){
		System.out.println("6��");
	}else if(x>=4000){
		System.out.println("7��");
	}else if(x>=2000){
		System.out.println("8��");
	}else{
		System.out.println("9��");
	}
	
	
	
}
} 