package non.access.mod.abstractConcepts;

@FunctionalInterface //annotation is additional information added on top of method to control the method
public interface InterfaceClass3 {
	
	public void loginIntoApplication();	

	
	default void signUp() {
		//this is not applicable
	}
	
	static void getHomePage() {
		System.out.println("Get Home Page");
	}
	
	private void getRegistrationPage() {
		System.out.println("Get Registration Page");
	}
	

}
