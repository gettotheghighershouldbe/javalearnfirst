class Point {

	int x;
	int y;
	int z;
	int s;

	Point (int a, int b, int c) {
		x = a;
		y = b;
		z = c;
	}

	public void setX(int a){
		x = a;
	}
	public void setY(int b){
		y = b;
	}
	public void setZ(int c){
		z = c;
	}

	public void figureSquare(){
		s =x*x + y*y +z*z;
		System.out.println("距离原点的距离="+s);
	}

	public void display() {
		System.out.println("x="+x+",y="+y+",z="+z);
	}

	
	}



public class Confused {

	public static void main (String[] args) {
		Confused kindle = new Confused ();
	Point jason = new Point (3, 4, 5);
	jason.display();
	jason.figureSquare();	

}
}

