import java.util.Scanner;

public class MultipleLoop{
	public static void main(String[] args){
	
	//����ѭ��
	//��ӡ���Σ�4*5����
	
	
	/*for(int i = 1;i<=4;i++){
		
		for(int j =1;j<=5;j++){
		
		System.out.print("*");
		}
		
		System.out.println();
		
	}*/
	
	
	//��ӡƽ���ı���(���ձ��˲�д�����ģ��߼���������ǿ)
	
	/*for(int i = 1;i<=5;i++){
		
		
		for(int k = 1;k<=i;k++){
			System.out.print(" ");
		}
		
		for(int j = 1;j<=5;j++){
			System.out.print("*");
		}
		
		System.out.println();
	}
	*/
	
	//��ӡ����������
	/*for(int i = 0;i<4;i++){
	
		for(int k = 0;k <= i;k++){
			System.out.print(" ");
		}
		
		for(int j =1;j<=7-2*i;j++){
			System.out.print("*");
		}
		
		System.out.println();
	}*/
	
	
	//��ӡ����(���ڻ�ûд����������ѧ)
	
	
	
	//����ѭ����ʹ��continue 3���༶��4��ѧԱ����������ÿ���༶����ѧԱƽ���֣�ͳ�Ƴɼ�����85��ѧԱ��
	
	
	Scanner sc = new Scanner(System.in);
	int count = 0;
	int sum = 0;
	for(int i =1;i<=3;i++){
		
		for(int k = 1;k<=4;k++){
			
			System.out.println("�������"+i+"��ĵ�"+k+"��ѧ���ķ���");
		    int j = sc.nextInt();
			
			if(j>85){
			System.out.println("���ѧ����������85��");
			count = count +1; 
		}else{continue;}
			sum = sum +j;
		}
	
		System.out.println("��"+i+"���ѧ��ƽ���ɼ�Ϊ"+sum/4);	
	
		
	}
		System.out.println("����85�ֵ�����Ϊ"+count);
	

		
		
	
		
	}
}