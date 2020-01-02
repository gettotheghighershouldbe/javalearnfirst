public class ExpertString{
	public static void main(String[] args){
		String[] pets = {"Fido","Zeus","Bin"};
		int x = pets.length;
		int y = (int)(x*Math.random());;
		String s = pets[y];

		String h = s + " " + "is a dog";
		System.out.println(h);

	}

}