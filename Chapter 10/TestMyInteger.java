import java.util.Scanner;
public class TestMyInteger {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int digit = input.nextInt();
		
		MyInteger newMyInteger = new MyInteger(digit);
		
		System.out.println(digit + " is even: " + newMyInteger.isEven(newMyInteger));
		System.out.println(digit + " is odd: " + newMyInteger.isOdd(newMyInteger));
		System.out.println(digit + " is prime: " + newMyInteger.isPrime(newMyInteger));
		
		
		System.out.print("\nEnter the number 17: ");
		int digit2 = input.nextInt();
		System.out.println("Test 17 is even: " + newMyInteger.isEven(digit2));
		System.out.println("Test 17 is odd: " + newMyInteger.isOdd(digit2));
		System.out.println("Test 17 is prime: " + newMyInteger.isPrime(digit2));
		
		
		System.out.println("\nis equal: " + newMyInteger.equals(digit));
		System.out.println("\nis equal: " + newMyInteger.equals(newMyInteger));
		
		char[] array = new char[4];
		System.out.println("\nConvert an array of characters into an integer. ");
		array[0] = '1';
		array[1] = '2';
		array[2] = '3';
		array[3] = '4';
		System.out.print("" + MyInteger.parseInt(array));
		
		System.out.println("\nConvert string '1234' into an integer ");
		String str = "1234";
		System.out.println("" + MyInteger.parseInt(str));
	}
}
class MyInteger {
	int value = 0;
	MyInteger(int value){
	}
	
	int getValue() {
		return value;
	}
	
	// isEven
	boolean isEven(){
		if(value % 2 == 0)
			return true;
		else 
			return false;
	}
	static boolean isEven(int value) {
		if(value % 2 == 0)
			return true;
		else 
			return false;
	}
	static boolean isEven(MyInteger n){
		if(n.getValue() % 2 == 0)
			return true;
		else 
			return false;
	}
	
	// isOdd
	boolean isOdd(){
		if(value % 2 != 0)
			return true;
		else 
			return false;
	}
	static boolean isOdd(int value){
		if(value % 2 != 0)
			return true;
		else 
			return false;
	}
	static boolean isOdd(MyInteger n){
		if(n.getValue() % 2 != 0)
			return true;
		else 
			return false;
	}
	
	// isPrime
	boolean isPrime(){
		if(value < 2) return false;
		if(value == 2) return true;
		if(value % 2 == 0) return false;
		for(int i=3; (i * i) <= value; i+=2){
			if(value % i == 0 ) return false;
		}
		return true;
	}
	static boolean isPrime(int value){
		if(value < 2) return false;
		if(value == 2) return true;
		if(value % 2 == 0) return false;
		for(int i=3; (i * i) <= value; i+=2){
			if(value % i == 0 ) return false;
		}
		return true;
	}
	static boolean isPrime(MyInteger n){
		if(n.getValue() < 2) return false;
		if(n.getValue() == 2) return true;
		if(n.getValue() % 2 == 0) return false;
		for(int i=3; (i * i) <= n.getValue(); i+=2){
			if(n.getValue() % i == 0 ) return false;
		}
		return true;
		
	}
	
	// equals
	boolean equals(int value){
		if(value == this.getValue())
		return true;
		else {
			return false;
		}
	}
	boolean equals(MyInteger n){
		if(value == this.getValue())
		return true;
		else {
			return false;
		}
	}
	
	static int parseInt(char[] s){
		int result = 0;
		for(int i = 0; i < s.length; i++){
			result = result + s[i];
		}
		return result;
	}
	static int parseInt(String s){
		int result = 0;
		for(int i = 0; i < s.length(); i++){
			result = result + s.charAt(i);
		}
		return result;
	}
}