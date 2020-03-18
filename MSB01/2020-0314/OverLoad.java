class Person {

	Person () {
			i = 300;
			int j;
	}

	Person (int _i) {
		//int i = _i; //如果用这种方式，会发现这个参数传进来之后，却还是原来的值。
		i = _i; 
		j = 6;
	} 

	Person (int _i, int _j) {
		i = _i;
		// int j = _j;如果用这种方式，会发现这个参数传进来之后，却还是原来的值。
		j = _j;
	}

	void id () {
		System.out.println("id是"+i+",age是"+j);
	}

	void id (String t) {
		System.out.println(t + "的id是" + i + ",age是" + j);
	}

	int i = 5;
	int j = 6;

}

public class OverLoad {

	public static void main (String[] args) {
		Person jack = new Person();
		Person jason = new Person(200);
		Person james = new Person(15,50);

		jack.id();
		jason.id("jason");
		james.id();
	}
}