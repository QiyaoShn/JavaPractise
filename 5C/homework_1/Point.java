package homework_1;

public class Point {
	void print() {
		System.out.println("This is the superclass!");
	}
	public static void main(String[] args) {
		Point superp = new Point();
		superp.print();
		Point3d subp = new Point3d();
		subp.print();
	}
}
