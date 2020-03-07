public class TestPrime {
	public static void main (String[] args) {
		//找出100～200以内的质数
		
		for (int i=101; i<=200; i+=2) 
		{
			boolean f = true;
			for (int j=2; j<i; j++) 
			{
				if (i % j == 0) 
				{
					f = false;
					break;
				}
			}


 





		if (!f)//这里对f进行取反，true取为false，false取为true.
		 {
		 	continue;
		 }

		 System.out.println("i="+i);


		}
	}
}