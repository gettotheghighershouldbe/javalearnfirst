import java.util.Scanner;


public class BreakPractice{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("������ѧ������");
	String name = sc.next();
	
	//����whileѭ��
	int i = 1;
	int count = 0;
	while(i<=6){
		System.out.println("�������"+i+"�ſεĳɼ�");
		int score = sc.nextInt();
		if(score>0){
			System.out.println(score);
		}else{
			System.out.println("��Ǹ������¼����������½���¼��");
			break;
		}
		count = score + count;
		i = i + 1;
		System.out.println("�źƵ�ƽ�����ǣ�"+count/(i-1));
	} 

	}
}