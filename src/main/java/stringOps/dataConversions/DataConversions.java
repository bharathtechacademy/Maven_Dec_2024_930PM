package stringOps.dataConversions;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataConversions {

	public static void main(String[] args) {
		
		// Any data type to String
		int phoneNumber = 345656;
		int stdCode = 144;
		String StdCode = String.valueOf(stdCode);
		System.out.println(StdCode+phoneNumber);
		
		// String to integer		
		String balance = "Account Balance : 3000.23";
		balance = balance.replaceAll("[^0-9.]", "");
//		int Balance = Integer.parseInt(balance);
		double Balance = Double.parseDouble(balance);
		System.out.println(Balance>=10000);
		
		//Date to String
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyyhhmmss");
		String uniqueId = sdf.format(Calendar.getInstance().getTime());
		System.out.println(uniqueId);
		
		//Type Casting
		
		//Primitive type casting
		
		int marks = 98;
		byte Marks = (byte)marks; //Narrow Casting
		
		int amount = 15000;
		double Amount = amount; //Auto Casting
		System.out.println(Amount);
		
		//Reference Type Casting
		
		
		

	}

}
