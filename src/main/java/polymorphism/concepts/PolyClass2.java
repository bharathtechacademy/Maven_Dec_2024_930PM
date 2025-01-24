package polymorphism.concepts;

public class PolyClass2 extends PolyClass1{
	
	public void sumOfNumbers(int a , int b) {
		int c = a+b; 
		System.out.println(c);
		//Overriding => multiple methods with same name,with same parameters between parent and child classes
	}
	
	public void sumOfNumbers(int a , int b,int c) {
		int d = a+b+c;
		System.out.println(d);
		//Over loading ==> multiple methods with same name, with in the same class with different parameters
	}

	public static void main(String[] args) {
		PolyClass2 obj = new PolyClass2();
		obj.sumOfNumbers(1, 2, 3);
		obj.sumOfNumbers(1, 2);
	}

}
