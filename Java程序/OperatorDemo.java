public class OperatorDemo{
	public static void main(String[] args){
		int a = 1;
		int b = 2;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);	
		System.out.println(a++);
		System.out.println(++a);
		
		System.out.println(a--);
		System.out.println(--a);
		System.out.println(b);
		System.out.println(++b+b++);
		System.out.println(b);
		//��չֵ�����
		int c =1;
		//��д������һ������ʾ��2�Ĳ���
		c = c + 2;
		c += 2;
		
		byte d =10;
		//d = d + 1;
		d += 1;
		
		//��ϵ�����:���ص�ֵ�ǲ������ͣ�Ҳ����˵ֻ��true��false�������
		System.out.println(1>2);
		System.out.println(1>2);	
		System.out.println(1>=2);
		System.out.println(1<=2);
		System.out.println(1==2);
		System.out.println(1!=2);
		
		a = 3;
		b = 2;
		System.out.println(a+=b);
		System.out.println(a);
		System.out.println(a-=b);
		a=3;
		b=2;
		System.out.println(a);
		System.out.println(b);
		//System.out.println(a+=a);
		//System.out.println(b+=b);
		
		System.out.println(a = a + a);
		System.out.println(b = b + b);
		System.out.println(a =  a + 1);
		//System.out.println(a + 1 = a);
		
		System.out.println(3>5 && 3<4);
		System.out.println(3>5 || 3<4);
		System.out.println(!(3>4));
		System.out.println(!false);
		
		//λ�������ֻ�ܲ�����ֵ��������ʱ���ת�ɶ����ƽ�������
		System.out.println(4 & 5);
		System.out.println(4 | 5);
		System.out.println(4 ^ 5);
		System.out.println(~4);
		
		System.out.println(2<<3);
		System.out.println(16>>2);
		
		System.out.println(3>2?3:2);
		
		int x =10;
		System.out.println(x<100 && x>0);
		
	}
}