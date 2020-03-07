public class OperationTest {
	public static void main(String[] args) {
		int i1 = 10;
		int i2 = 20;
		int i = (i2++);
		System.out.println("i="+i);
		System.out.println("i2="+i2);


		i = (++i2);
		System.out.println("i="+i);
		System.out.println("i2="+i2);


		i = (i1--);
		System.out.println("i="+i);
		System.out.println("i1="+i1);

		i = (--i1);
		System.out.println("i="+i);
		System.out.println("i1="+i1);

		boolean a,b,c;
		a = true;
		b = false;

		c = a & b;
		System.out.println(c);

		c = a | b;
		System.out.println(c);

		c = a ^ b;
		System.out.println(c);

		c = !a;
		System.out.println(c);

		c = a && b;
		System.out.println(c);

		c = a || b;
		System.out.println(c);


		long l = 100;
		System.out.println(l);

		int score = 80;
		String type = score < 60 ? "及格" : "不及格";
		System.out.println(type);

		int x = -100;
		int flag = x > 0 ? 1 : (x==0 ? 0 : -1);
		System.out.println(flag);










	}	
}