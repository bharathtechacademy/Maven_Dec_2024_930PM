package com.selenium.locators;

public class Test {

	public static void main(String[] args) {
		
		String [] input = {"flower","flow","flight"};
		
		if(input==null || input.length ==0) {
			System.out.println("No values Present, So common Prefix is : ");
		}else {
			
			String prefix = input[0]; //flower
			int length = prefix.length(); //6
			
			for(int i=0;i<length;i++) {
				prefix = prefix.substring(0,length-i);
				boolean status = true; //starts with true
				for(String val : input) {
					if(!val.startsWith(prefix)) {
						status =false;
						break;
					}
				}
				if(status) {
					System.out.println("Common prefix is :"+prefix);
					break;
				}
				
				if(prefix.length()==1) {
					System.out.println("Common prefix is : EMPTY");
				}
			}
			
			
			
		}

	}

}
