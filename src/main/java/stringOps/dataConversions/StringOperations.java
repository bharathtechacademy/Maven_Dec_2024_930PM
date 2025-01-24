package stringOps.dataConversions;

public class StringOperations {

	public static void main(String[] args) {
		
		String value =" Username : Admin | Password : admin123 ";
		
		//Get Total chars available with in the STring ==> String.length();
		System.out.println("Total Chars : "+value.length());
		
		//Get specific char from the String ==> String.charAt(Index);
		System.out.println("5th char of String is :"+value.charAt(4));
		
		//Print reverse String value 
		String reverseValue = "";
		for(int i=value.length()-1; i>=0; i--) {
			reverseValue=reverseValue+value.charAt(i);
		}
		System.out.println(reverseValue);
		
		//Remove unwanted spaces from the String ==> String .trim();
		System.out.println(value);
		System.out.println(value.trim());
		
		//Remove all spaces from the String ==> String.replace(oldChar, newChar);
		System.out.println(value.replace(" ", ""));
		
		//Remove all alphabets from the String ==> String.replaceAll(regExp, newChar);
		System.out.println(value.replaceAll("[a-zA-Z]", ""));
		
		//Remove all numbers from the String ==> String.replaceAll(regExp, newChar);
		System.out.println(value.replaceAll("[0-9]", ""));
		
		//Remove all special chars from the String ==> String.replaceAll(regExp, newChar);
		System.out.println(value.replaceAll("[^0-9a-zA-Z]", ""));
		
		//Update the case of chars in String
		System.out.println(value.toUpperCase());
		System.out.println(value.toLowerCase());

		//Extract part of the text from the STring ==> String.subString(startIndex, endIndex+1)
		System.out.println(value.substring(12,17));
		System.out.println(value.substring(31));

		//Extract part of the text from the dynamic STring ==> String.split(regExp);
		String [] splittedValues = value.split(" ");
		System.out.println(splittedValues[3]);
		System.out.println(splittedValues[7]);
		
		//Compare the String
		//equals ==> every char along with case should match
		//equalsIgnoreCase==> every char  should match by ignoring case of chars
		//contains ==> String contains other value with same case
		//startsWith ==> String starts with
		//endsWith ==> String ends with 
		
		String value1="Bharath";
		String value2="bharath";
		String value3="Bharath";
		String value4 = "hara";
		String value5 = "Hara";
		
		System.out.println(value1.equals(value2));
		System.out.println(value1.equals(value3));
		System.out.println(value1.equalsIgnoreCase(value2));
		System.out.println(value1.contains(value4));
		System.out.println(value1.contains(value5));
		System.out.println(value1.startsWith("Bhar"));
		System.out.println(value1.endsWith("ath"));
		
		//different classes allows to store text values
		//String ==> immutable class
		//StringBuffer ==> mutable ==> Synchronized
		//StringBuilder ==> mutable ==> non-synchronized
		
		String name = "Soumya";
		name.concat(" Kulakarni");
		System.out.println(name);

		StringBuffer name1 = new StringBuffer("Trivin");
		name1.append(" Ganesh");
		System.out.println(name1);

		StringBuilder name2 = new StringBuilder("Trivin");
		name2.append(" Ganesh");
		System.out.println(name2);


	}

}
