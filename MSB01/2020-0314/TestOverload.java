public class TestOverload {
	void max (int a, int b) {
		System.out.println(a > b ? a :b);
		System.out.println("int");
	}
	void max (double a, double b) {
		System.out.println(a > b ? a : b);
		System.out.println("double");
	}





	public static void main (String[] args) {
		TestOverload t = new TestOverload();
		t.max(1.0, 2.0);
	}
}  