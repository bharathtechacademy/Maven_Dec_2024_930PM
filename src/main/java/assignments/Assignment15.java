package assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment15 {

	public static void main(String[] args) {

		String input = " I Love Dogs ";
		// Removed all the white spaces by using replace method
		String FilteredInput = input.replace(" ", "");
		List<String> values = new ArrayList<String>();
//		for (int i = 0; i < FilteredInput.length(); i++) {
//			for (int j = i + 1; j < FilteredInput.length(); j++) {
//
//				char char1 = FilteredInput.charAt(i);
//				char char2 = FilteredInput.charAt(j);
//
//				if (char1 != char2) {
//					values.add(FilteredInput.valueOf(char1) + FilteredInput.valueOf(char2));
//					values.add(FilteredInput.valueOf(char2) + FilteredInput.valueOf(char1));
//				}
//
//			}
//		}
		
		for (int i = 0; i < FilteredInput.length(); i++) {
			for (int j = 0 ; j < FilteredInput.length(); j++) {

				char char1 = FilteredInput.charAt(i);
				char char2 = FilteredInput.charAt(j);

				if (char1 != char2) {
					values.add(char1+""+char2);					
				}

			}
		}
		
		System.out.println(values.size());

	}

}