//break:��������ѭ������ѭ����ͨ�����������һ��ʹ�á�

import java.util.Scanner;


public class BreakDemo{
	public static void main(String[] args){
		/*int total = 0;
		System.out.println("Begin");
		while(true){
			
			int i = (int)(Math.random()*100);
			System.out.println(i);
			if(i == 88)break;
			total++;
		}
		System.out.println("Game over,used"+total+"times");
		*/
		
		
	Scanner sc = new Scanner(System.in);
	System.out.println("���ʽ��������ڼ���");
	int i = sc.nextInt();
	switch(i){
		case 1:
		System.out.println("����һ");
		break;
		case 2:
		System.out.println("���ڶ�");
		break;
		case 3:
		System.out.println("������");
		break;
	}
		
		
		
	}
}

