package exception.handling;

public class TryCatchExceptionHandling {

//	try {
//		
//	}catch(Exception e) {
//		
//	}

	public static void main(String[] args) {

		try {
			int i = 10;
			int j = 5;
			j += 5;
			System.out.println(i / (i - j));
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
			System.out.println("There is an error in the program");
			System.out.println(1/0);
		} finally {
			System.out.println("Execution Completed");
		}

	}

}
