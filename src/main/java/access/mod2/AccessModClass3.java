package access.mod2;

import access.mod1.AccessModClass1;

public class AccessModClass3{

	public static void main(String[] args) {
		AccessModClass1 obj = new AccessModClass1();
		System.out.println(obj.empName);
		obj.printEmpDetails();
		
//		obj.setName("Anurag");
//		System.out.println(obj.getName());

	}

}
