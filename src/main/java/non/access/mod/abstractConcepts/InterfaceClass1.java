package non.access.mod.abstractConcepts;

public interface InterfaceClass1 {

	// Interface is special abstract class
	// It's a 100% abstract class

	public void loginIntoApplication();

	public void click();

	public void logoutFromApplication();
	
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
