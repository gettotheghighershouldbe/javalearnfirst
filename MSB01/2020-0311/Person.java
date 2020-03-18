public class Person {
	int id;
	int age = 20;

	//其他的一些方法暂时不写。
	Person(int _id, int _age) {
		id = _id;
		age = _age;
	}

	public static void main (String[] args) {
		Person tom = new Person(1, 25);
		Point p = new Point();// 这里无法从静态中引用非静态
		// Person jerry = new Person();

	}


}
class Point {
	Point () { }
	int x;
	int y;
}