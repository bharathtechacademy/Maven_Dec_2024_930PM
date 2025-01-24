package exception.handling;

public class ThrowAnCustomException {

	public static void main(String[] args) throws Exception {

		int age = 10;

		if (age < 18)
			throw new Exception("You are Not Eligible to Vote");
		else
			System.out.println("You are Eligible to Vote");

		System.out.println("Execution is Completed");

	}

}
