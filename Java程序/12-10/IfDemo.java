import java.util.Scanner;

public class IfDemo{
	public static void main(String[] args){
	
	//����֧�ṹ
	//int i = (int)(6*Math.random())+10;	
	//System.out.println(i);
	
	/*double i = 6*Math.random();
	//System.out.println(i);
	double j = 6*Math.random();
	double k = 6*Math.random();
	
	int count = (int)(i+j+k);
	//System.out.println(count);
	
	if(count>15){
		System.out.println("��������������");
	}
	if(count>=10 && count<=15){
	System.out.println("��������һ���");
	}
	if(count<10){
		System.out.println("���������е��");
	}
	
	System.out.println("�����ܹ�����"+count+"��");*/
	
	
	//˫��֧�ṹ
	/*double r = 4*Math.random();
	double area = Math.PI*Math.pow(r,2);
	double circle = 2*Math.PI*r;
	
	System.out.println("�뾶Ϊ"+r);
	System.out.println("���Ϊ"+area);
	System.out.println("�ܳ�Ϊ"+circle);
	
	
	if(area>=circle){
		System.out.println("������ڵ����ܳ�");
	}
	else{
		System.out.println("���С���ܳ�");
	}*/
	
	
	//���֧�ṹ
	/*int age =(int)(100*Math.random());
	System.out.println("������"+age+",����");
	if(age<15){
		System.out.println("��ͯ��ϲ����");
	}else if(age<25){
		System.out.println("���꣬ϲ��ѧϰ");
	}else if(age<45){
		System.out.println("���꣬Ŭ������");
	}else if(age<65){
		System.out.println("�����꣬Ҫ����");
	}else if(age<85){
		System.out.println("���꣬���˶�");
	}else{
		System.out.println("�����ǣ�����ϡ");
	}*/
	
	//Ƕ�׷�֧�ṹ
	/*int score = (int)(50*Math.random());
	System.out.println(score);
	if(score<20){
		System.out.println("��ϲ�������");
		Scanner sc = new Scanner(System.in);
		String sex = sc.nextLine();
		if(sex.equals("��")){
			System.out.println("����������");
		}else{
			System.out.println("����Ů����");
		}
	}else{
		System.out.println("�Բ����㱻��̭������");
	}*/
	
	//�ϸ����������Լ����õ�д��
	int time = (int)(40*Math.random());
	System.out.println(time);
	if(time<20){
		System.out.println("��ϲ�������");
		String sex = ((int)(Math.random()*2))==0?"girl":"boy";
		if(sex.equals("girl")){
			System.out.println("��ӭ�����Ů����");
		}else{
			System.out.println("��ӭ�����������");
		}
	}else{
		System.out.println("�Բ����㱻��̭��");
	}
	
	
	
	
	
	
	}
	
	}

