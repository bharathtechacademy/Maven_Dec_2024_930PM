package non.access.mod.staticConcepts;

public class StaticClass1 {
	
	// before the data 
	// before method
	
	//Always access modifier should be used before non-access modifier
	
	String name1 = "Eswari";
	static String name2 = "Devi";
	
	public void printName1() {
		System.out.println(name1);
	}
	
	public static void printName2() {
		System.out.println(name2);
	}

	public static void main(String[] args) {
		StaticClass1 obj = new StaticClass1();
		System.out.println(obj.name1);
		obj.printName1();
		
		System.out.println(name2);
		printName2();
	}

}
