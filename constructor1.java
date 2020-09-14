package week11;

public class constructor1 {
	int age=5;
	String size;
	String breed="Persian";
	
	constructor1(){
		System.out.println("My cat is age ="+age);
		System.out.println("My cat is breed ="+breed);
	}
	void mathod1() {
		System.out.println("My cat is size ="+size);
	}
	void maethod2() {
		
	}
	public static void main(String[]grge) {
		constructor1 cat1 = new constructor1();
		constructor1 cat2 = new constructor1();
		cat2.size="small";
		cat2.mathod1();
	}
}
