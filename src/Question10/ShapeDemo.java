package Question10;

public class ShapeDemo {
	public static void main(String[] args) {
		Shape shape[] = new Shape[3];// Array of objects
		shape[0] = new Circle(); // Instatiating Class Circle
		shape[1] = new Polygon(); // Instatiating Class Polygon
		shape[2] = new Rectangle(); // Instatiating Class Rectangle

		for (int i = 0; i < 3; i++) {
			shape[i].draw();
		}
	}
}
