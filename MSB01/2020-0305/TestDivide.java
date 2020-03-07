public class TestDivide {
	public static void main (String[] args) {
		//输出1～100内前5个可以被3整除的数
		 int count = 0;
		 for (int i=1; i<=100; i++) {
		 	if (i % 3 == 0) {
		 		System.out.println(i);
		 		count += 1;
		 		// if (count == 5){
		 		// break;}
		 	}
		 	

		 	if (count == 5){
		 		break;
		 	}
	 
	}


}
}
