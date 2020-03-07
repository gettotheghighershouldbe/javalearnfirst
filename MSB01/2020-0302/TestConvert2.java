public class TestConvert2{
	public static void main(String[] args){
		int i = 1,j;
		float f1 = 0.1f;//(float)0.1
		float f2 = 123;
		System.out.println("f1="+f1);
		System.out.println("f2="+f2);

		long l1 = 12345678;
		long l2 = 8888888888L;
		System.out.println("l1="+l1);
		System.out.println("l2="+l2);

		double d1 = 2e20 , d2 = 124;
		System.out.println("d1="+d1);
		System.out.println("d2="+d2);

		byte b1 =1 , b2 =2 , b3 = 125;
		System.out.println("b1="+b1);
		System.out.println("b2="+b2);
		System.out.println("b3="+b3);

		j = 12;

		j = j + 10;

		// i = i/10;
		i = (int)(i * 0.1);
		System.out.println("i="+i);

		char c1 = 'a';
		char c2 = 125;
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);

		byte b = (byte)(b1 - b2);
		System.out.println("b="+b);

		char c = (char)(c1 + c2);
		System.out.println("c="+c); 

		float f3 = f1 + f2;
		System.out.println("f3="+f3);

		float f4 = (float)(f1 +f2 * 0.1);
		System.out.println("f4="+f4);

		double d = d1*i + j;
		System.out.println(d);

		float f = (float)(d1*5+d2);
		System.out.println("f="+f);

	}
}