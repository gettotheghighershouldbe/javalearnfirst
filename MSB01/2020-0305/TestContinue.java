public class TestContinue {
	public static void main (String[] args) {
		//用continue输出1，2，3，5；
		

		/*for (int i=1; i<=5; i++){
			if (i == 4)
			{
				continue;
			}
			System.out.println("i="+i);
		}*/


		int i = 0;
		while (i<5) {
			i++;  //i++只有放在前面才能避免while中continue的死循环；
			if (i == 4){ continue; }

			System.out.println("i="+i);


		}





	}
}