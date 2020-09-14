package week11;

public class cat {
	String breed="aa";
	String size;
	String colour;
	int age;
	
	void print() {
		System.out.println("Breed is: "+breed);
		System.out.println("Size is: "+size);
	}
	void name() {
		System.out.println("My cat");
	}
	public static void main(String[]args) {
		cat cat1 = new cat();
		cat cat2 = new cat();
		cat1.breed="Persian";
		cat1.size="Small";
		cat1.colour="Whitblack";
		cat1.age=5;
		cat1.print();
		cat2.breed="British Shorthair";
		cat2.size="Big";
		cat2.print();
	}
}
