import java.util.Date;
class Triangle extends GeometricObject{
	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;
	
	
	
	Triangle (){
	}
	Triangle (double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	Triangle (double side1, double side2, double side3, String color, boolean filled) {
		super(color, filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
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
		return super.toString() + " Triangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3;
	}
}

	