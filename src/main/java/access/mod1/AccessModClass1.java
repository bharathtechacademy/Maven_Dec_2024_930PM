package access.mod1;

public class AccessModClass1 {
	
	public String empName = "Amit";
	
	public void printEmpDetails() {
		System.out.println("1234");
		System.out.println("MP");
	}

	public static void main(String[] args) {
		AccessModClass1 obj = new AccessModClass1();
		System.out.println(obj.empName);
		obj.printEmpDetails();
	}

	
	public String getName() {
		return empName;
	}
	
	public void setName(String newName) {
		empName = newName;
	}
}
