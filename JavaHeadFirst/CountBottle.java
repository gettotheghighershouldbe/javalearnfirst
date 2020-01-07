public class CountBottle{
	public static void main(String[] args){
		int number = 99;
		String word = "bottles";
		while(number>0){
			if(number == 1){
				word = "bottle";
			}
			System.out.println(number + " " + word +"of bear on the wall");
			System.out.println(number + " " + word + "of bear");
			System.out.println("take on down and pass it around");
			number = number - 1;

			if(number > 0){
				System.out.println(number + " " + word +"of bear on the wall");				
			}else{
				System.out.println("no more bottle");
			}
		}
	}
}