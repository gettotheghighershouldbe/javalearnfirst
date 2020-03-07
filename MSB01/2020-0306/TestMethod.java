public class TestMethod {
	public static void main (String[] args) {

		m (2);
		m2 (3,4);
		m3 (4,'5');
		int i = m4 (4,6);
		System.out.println("i="+i);
	}


	public static void m (int i) {
		if (i > 3) 
		{
			return;
		}
		System.out.println("i="+i);
	}


	public static void m2 (int i, int j) {

		System.out.println("i="+i);
		System.out.println("j="+j);
	}

	public static void m3 (int i, int j) {

		System.out.println(i+j);
		return;
	}


	public static int m4 (int i,int j) {

		return i > j ? i : j;
	}


}