public class TestRecurrence {
	public static void main (String[] args) {
		System.out.println(f(7));
	}

	public static int f (int i) {
		if (i == 1 || i == 2) 
		{
			return 1;
		} 

		else
		{
			
			return f(i-1) + f(i-2);
		}
	}

}