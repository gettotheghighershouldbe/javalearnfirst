public class OddSum {
		public static void main (String[] args) {
			int result = 0;
			for (int i = 1;i <= 100;i = i +2) {
				result += i;
			}

			System.out.println(result);


			int Sum = 0;
			for (int i = 1;i <= 100;i++) {
				if (i % 2 == 1) {
					Sum += i;
				}
			}
			System.out.println(Sum);
		}
}