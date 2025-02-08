package com.training.java.assignments;

public class Assignment23 {

	public static void main(String[] args) {
		String[] input = { "flower", "flow", "flight" };

		if (input == null || input.length == 0) {
			System.out.println("Longest Common Prefix: ");
		} else {
			String prefix = input[0];
			int length = prefix.length();

			for (int i = 0; i < length; i++) {
				prefix = prefix.substring(0, length - i);
				boolean isCommon = true; // Flag to check if prefix is common
				for (String value : input) {
					if (!value.startsWith(prefix)) {
						isCommon = false;
						break;
					}
				}
				if (isCommon) {
					System.out.println("Longest Common Prefix: " + prefix);
					break;
				}
				if (prefix.length() == 1) {
					System.out.println("Longest Common Prefix: ");
				}

			}

		}
	}
}
