import java.util.Scanner;

public class ComprePractice{
	public static void main(String[] args){
	//ѭ��¼���Ա��Ϣ
	System.out.println("****************");
	System.out.println("��ӿͻ���Ϣ");
	System.out.println("****************");
	Scanner sc = new Scanner(System.in);
	String number;
	String birth;
	int score;
	
	for(int i = 1;i<=3;i++){ 
	System.out.println("�������Ա�ţ�");
	number = sc.next();
	
	System.out.println("�������Ա���գ���/��<����λ������ʾ>����");
	birth = sc.next();
	
	System.out.println("�������Ա����");
	score = sc.nextInt();
	int length = number.length();
	
	if(length != 4){
		
		System.out.println("¼����Ϣʧ��");
		continue;
	}
	System.out.println("��¼��Ļ�Ա��Ϣ��");
	System.out.println(number+"\t"+birth+"\t"+score);
	}
	
	System.out.println("�������");
	}
}