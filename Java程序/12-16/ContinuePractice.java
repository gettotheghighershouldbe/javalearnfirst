import java.util.Scanner;
//continueֻ������ѭ�������ѭ������ʣ�������ִ����һ��ѭ����ͨ�����������һ��ʹ�ã�����ѭ��
public class ContinuePractice{
	public static void main(String[] args){
		
		//ѭ��¼��java�ε�ѧ���ɼ���ͳ�Ʒ������ڵ���80�ֵ�ѧ������
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�༶������Ϊ��");
		int j = sc.nextInt();
		int count = 0;
		int score;
		for(int i = 1;i<=j;i++){
		
			System.out.println("�������"+i+"λѧ���ĳɼ�:");
			score = sc.nextInt();
			if(score<80){
				continue;
			}
			count = count + 1;
		}
			System.out.println("80�����ϵ�ѧ��������"+count);
			double rate = (double)count/j*100;
			System.out.println("80�����ϵ�ѧ����ռ�ı�����"+rate+"%");
		
	}
}