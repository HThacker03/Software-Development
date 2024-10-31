public class Exercise13_11 {
	public static void main(String[] args) {
		Octagon octagon1 = new Octagon(4);
		Octagon octagon2 = (Octagon)octagon1.clone();
		
		octagon1.compareTo(octagon2);
		System.out.print(octagon1.compareTo(octagon2));
		
	}
}