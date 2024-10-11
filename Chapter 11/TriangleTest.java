import java.util.Scanner;
public class TriangleTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter triangle side 1: ");
		double s1 = input.nextDouble();
		System.out.print("Enter triangle side 2: ");
		double s2 = input.nextDouble();
		System.out.print("Enter triangle side 3: ");
		double s3 = input.nextDouble();
		
		System.out.print("Enter a color: ");
		String color = input.next();
		System.out.print("Triangle filled true or false: ");
		boolean filled = input.nextBoolean();
		
		Triangle newTriangle = new Triangle(s1, s2, s3);
		System.out.print("\n" + newTriangle.toString());
		
		System.out.println("\nTriangle Perimeter: " + newTriangle.getPerimeter());
		System.out.println("Triangle area: " + newTriangle.getArea());
		
		
		GeometricObject newGeometricObject = new GeometricObject(color, filled);
		System.out.print("\nTriangle " + newGeometricObject.toString());
		
	}
}
class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}
	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled){
		this.filled = filled;
	}
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
}
class Triangle extends GeometricObject{
	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;
	
	Triangle (){
	}
	Triangle (double newSide1, double newSide2, double newSide3) {
		side1 = newSide1;
		side2 = newSide2;
		side3 = newSide3;
	}
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	public double getArea(){
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}
	public double getPerimeter() {
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}
	public String toString(){
		return "Triangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3;
	}
}