public class Point {

	int x;
	int y;
	int z;
	int s;

	Point (int a, int b, int c) {
		x = a;
		y = b;
		z = c;
	}

	void setX(int a){
		x = a;
	}
	void setY(int b){
		y = b;
	}
	void set(int c){
		z = c;
	}

	public void figureSquare(){
		s =x*x + y*y +z*z; 
		System.out.println("距离原点的距离="+s);
	}

	public void display() {
		System.out.println("x="+x+",y="+y+",z="+z);
	}

	public static void main (String[] args) {
		Point kindle = new Point(3, 4, 5);
		kindle.display();
		kindle.figureSquare();
		kindle.setX (6);
		kindle.display();
		kindle.figureSquare();
	}

}




