import java.util.Scanner;
public class WhilePractice{
	public static void main(String[] args){
		//100���ڵ�ż�������
		/*int i = 1;
		int count = 0;
		while(i<=100){
			if(i%2 == 0){
			count = count + i;	
			}
			
			i ++;
		}
		System.out.println("100����ż���ĺ�ֵΪ"+count);*/
		
		//�����嵥ʵ��(�Լ���˼·�ͷ�ʽ)
		
		/*System.out.println("****************************");
		System.out.println("��ѡ�������Ʒ��ţ�");
		System.out.println("1.T��"+"2.����Ь"+"3.������");
		System.out.println("****************************");
		
		String str = "y";
		Scanner sc = new Scanner(System.in);
		double sum = 0.0;
		while(str.equals("y")){
			
			double count = 0.0;
			double price = 0.0;
			System.out.println("��������Ʒ���");
			int num = sc.nextInt();
			System.out.println("�����빺����Ʒ������");
			int qty = sc.nextInt();
			if(num==1){
				System.out.println("T����245.0 ����"+qty+"�ϼƣ�"+245.0*qty);
				price = 245.0;count = price*qty;
			}else if(num==2){
				System.out.println("����Ь��570.0 ����"+qty+"�ϼƣ�"+570*qty);
				price = 570.0;count = price*qty;
			}else{
				System.out.println("�����ģ�320.0 ����"+qty+"�ϼƣ�"+320*qty);
				price = 320.0;count = price*qty;
			}
			//����д���ǲ�̫�õ�
			sum = sum + count;
			System.out.println(sum);
			System.out.println("�Ƿ����(y/n)");
			str = sc.next();
			System.out.println(str);
			
		}
		double discount = 0.0;
		discount = 0.8*sum;
		System.out.println("Ӧ�����="+discount);
		
		System.out.println("ʵ�����Ϊ");
		double pay = sc.nextDouble();
		System.out.println("ʵ�����="+pay);

		if(pay<discount){
			System.out.println("������Ľ��С��Ӧ�������������룺");
		}else{
			System.out.println("����"+(pay-discount));
		}*/
		
		
		//����˱��˵ĺ÷���д�Ĺ�����㣨switch�ڵ�ֵ��ȷʵ�ȽϺ��ã�
		/*Scanner sc = new Scanner(System.in);
		System.out.println("**************************");
		System.out.println("��ѡ�������Ʒ��ţ�");
		System.out.println("1.T��"+"2.����Ь"+"3.������");
		System.out.println("**************************");
		
		
		String goon = "y";
		double sum = 0.0;
		
		while(goon.equals("y")){
			
			double price = 0.0;
			double count = 0.0;
			String name;
			
			System.out.println("��������Ʒ���");
			int num = sc.nextInt();
			System.out.println("�����빺����Ʒ������");
			int qty = sc.nextInt();
			
			switch(num){
				case 1:
				price = 245.0;
				name = "1.T��";
				count =  price * qty;
				System.out.println("��ѡ��Ĳ�Ʒ��"+name+",������"+qty+",�ϼƼ۸���"+count);
				break;
				
				case 2:
				price = 570.0;
				name = "2.����Ь";
				count =  price * qty;
				System.out.println("��ѡ��Ĳ�Ʒ��"+name+",������"+qty+",�ϼƼ۸���"+count);
				break;
				
				case 3:
				price = 320.0;
				name = "3.������";
				count =  price * qty;
				System.out.println("��ѡ��Ĳ�Ʒ��"+name+",������"+qty+",�ϼƼ۸���"+count);
				break;
			}
			
			sum = count + sum;
			System.out.println("�Ƿ����:y/n");
			goon = sc.next();
			
			System.out.println("�Ƿ������ִ���ꣿ");
		}
		
		System.out.println("��Ʒ�۸��ܼ�"+sum);
		double discount = sum * 0.8;
		System.out.println("��ƷӦ��"+discount);
		System.out.println("��Ʒʵ��");
		double pay = sc.nextDouble();
		
		
		if(pay<discount){
			System.out.println("Ǯ�����ˣ���Ǯ");
		}else{
			System.out.println("��Ǯ"+(pay-discount));
		}*/
		
		
		
		//����˿��������(�Լ�д������е㸴�ӣ���������ʵ���޸ĵ����󣬻�����)
		
		/*int agedown = 0;
		int ageup = 0;
		double agesum = 0.0;
		double downrate = 0.0;
		double uprate = 0.0;
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<11;i++){
			System.out.println("�������"+i+"λ�˿͵�����");
			int age = sc.nextInt();
			if(age<=30){
				System.out.println("����С��30��");
				agedown = agedown+1; 
				System.out.println(agedown);
			}else{
				System.out.println("�������30��");
				ageup = ageup+1;
				System.out.println(ageup);
			}
		}	
		agesum = agedown+ageup;
		downrate = agedown/agesum;
		uprate = ageup/agesum;
		System.out.println("30�����µı����ǣ�"+downrate*100+"%");
		System.out.println("30�����ϵı����ǣ�"+uprate*100+"%");*/
		
		
		//��while��forѭ���ֱ����100����������ż���ĺͣ��������
		//����whileѭ��
		
		/*int i=1;
		int count = 0;
		while(i<=100){
			if(i%2==0){
			count = count + i;}
			i++;
		}
		System.out.println("100���ڵ�����ż�����Ϊ"+count);
		*/
		
		//100����������ӵĺ�
		/*int i=1;
		int count = 0;
		while(i<=100){
			if(i%2==1){
				count=count+i;
			}
			i++;
		}
		System.out.println("100���ڵ������������Ϊ"+count);*/
		

		//��forѭ��ʵ�� ��ʵ��ż����
		
		/*int count = 0;
		for(int i=1;i<=100;i++){
			if(i%2==0){
				count = count + i;
			}
		}
		System.out.println("100���ڵ�����ż�����Ϊ"+count);*/
		
		//����forʵ��������
		
		/*int count = 0;
		for(int i=1;i<=100;i++){
			if(i%2==1){
				count = count + i;
			}
		}
		System.out.println("100���ڵ������������Ϊ"+count);*/
		
		
		//��while��forѭ�����1-1000֮���ܱ�5������������ÿ�����3����
		//����whileѭ������
		int i = 1;
		int count = 0;
		while(i<1000){
			if(i%5==0){
				System.out.println(i);
				count++;
				if(count>=3){
				System.out.println(\t);
			}
			
			}
			
			i++;
		}		
		
		
	}
}