public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable{

	double side = 0;
	
	Octagon(){
	}
	
	Octagon(double side){
		this.side = side;
	}
	
	Octagon(double side, String color, boolean filled){
		super(color, filled);
				this.side = side;
	}
	
	public double getSide(){
		return side;
	}
	public double setSide(){
		this.side = side;
		return side;
	}
	
	public double getArea(){
		double area = ((2 + 4/(Math.sqrt(2))) * side * side);
		return area;
	}
	public double getPerimeter(){
		double perimeter = side * 8;
		return perimeter;
	}
	
@Override
public int compareTo(Octagon o) {
	if (getArea() > o.getArea())
		return 1;
	else if (getArea() < o.getArea())
		return -1;
	else 
		return 0;
}
	
	@Override
	public Object clone() {
		try {
			return super.clone();
		}
		catch (CloneNotSupportedException ex) {
			return null;
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + " Area: " + getArea();
	}
}
