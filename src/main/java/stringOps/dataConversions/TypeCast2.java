package stringOps.dataConversions;

public class TypeCast2 extends TypeCast1{

	public static void main(String[] args) {
		TypeCast1 obj = new TypeCast2(); //Upcasting	
		
		TypeCast2 obj2 = (TypeCast2)obj; //down casting
		
		int marks = 98;
		byte Marks = (byte)marks;
		
	}

}
