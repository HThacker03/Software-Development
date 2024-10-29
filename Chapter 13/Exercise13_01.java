import java.util.Scanner;
public class Exercise13_01 {
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
		
		
		Triangle newTriangle = new Triangle(s1, s2, s3, color, filled);
		System.out.print("\n" + newTriangle.toString());
		
		System.out.println("\nTriangle Perimeter: " + newTriangle.getPerimeter());
		System.out.println("Triangle area: " + newTriangle.getArea());
		System.out.println();
		
	}
}
