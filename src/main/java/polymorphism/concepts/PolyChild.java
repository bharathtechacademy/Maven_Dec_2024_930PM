package polymorphism.concepts;

public class PolyChild extends PolyParent {
	
	String name = "Selenium";
	
	public void printName(String name) {
		System.out.println(name);
//		System.out.println(new PolyChild().name);
//		System.out.println(new PolyParent().name);
		System.out.println(this.name);
		System.out.println(super.name);
	}

	public static void main(String[] args) {
		PolyChild obj = new PolyChild();
		obj.printName("API");
	}

}
