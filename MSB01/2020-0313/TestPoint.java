class Point {
	double x, y, z;

	Point (double _x, double _y, double _z) {
		x = _x; y = _y; z = _z;
	}

	void setX (double _x) {
		x = _x;
	}

	double figureDistance(Point p) {
		return (x - p.x)*(x - p.x) + (y - p.y)*(y - p.y) + (z-p.z)*(z - p.z);
	}


}


public class TestPoint {
	public static void main (String[] args) {

		Point p = new Point (3.0, 4.0, 5.0);
		Point p1 = new Point(0.0, 0.0, 0.0);
		System.out.println(p.figureDistance(p1));
		
		p.setX(2);
		System.out.println(p.figureDistance(p1));

		Point p2 = new Point(1.0, 1.0, 1.0);
		System.out.println(p.figureDistance(p2));

		System.out.println(p.figureDistance(new Point(1.0, 1.0, 1.0)));

	}
}