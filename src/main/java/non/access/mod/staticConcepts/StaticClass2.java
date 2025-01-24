package non.access.mod.staticConcepts;

public class StaticClass2 {

	public static void main(String[] args) {
		StaticClass1 obj = new StaticClass1();
		System.out.println(obj.name1);
		obj.printName1();
		
		System.out.println(StaticClass1.name2);
		StaticClass1.printName2();

	}

}
