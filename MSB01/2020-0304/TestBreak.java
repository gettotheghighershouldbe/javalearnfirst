public class TestBreak1 {
	public static void main (String[] args) {
		//用break来输出1到3
		int i = 1;
		while (i <= 10) {
			if (i == 4) 
			{
				break;
			}
			System.out.println(i);
			i++;
		}
		System.out.println("i="+i);
	} 

}