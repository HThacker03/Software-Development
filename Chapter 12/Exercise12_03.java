import java.util.Scanner;
public class Exercise12_03 {
	public static void main(String[] args) {
		try{
			int[] newArray = new int[100];
			int number = 0;
			for (int i = 0; i < newArray.length; i++){
				number = (int)(Math.random() * 100);
				newArray[i] = number;
			}
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the index of the 100 integer array: ");
			int index = input.nextInt();
			System.out.print("The integer at index " + index + " is " + newArray[index]);
		}
		catch(Exception ex){
			System.out.print("Out of bounds array index.");
		}
	}
}