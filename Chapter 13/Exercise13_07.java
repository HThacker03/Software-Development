public class Exercise13_07 {
	public static void main(String[] args) {
		Triangle triangle1 = new Triangle(2, 2, 2, "blue", true);
		Triangle triangle2 = new Triangle(3, 3, 3, "red", true);
		Triangle triangle3 = new Triangle(4, 4, 4, "gray", false);
		Triangle triangle4 = new Triangle(5, 5, 5, "purple", true);
		Triangle triangle5 = new Triangle(6, 6, 6, "orange", false);
		
		Triangle[] triangleArray = {triangle1, triangle2, triangle3, triangle4, triangle5};
		
		for (int i = 0; i < triangleArray.length; i++) {
			System.out.println("\nTriangle at index " + i + " area: " + triangleArray[i].getArea() + " ");
			triangleArray[i].howToColor();
		}
		
	}
}