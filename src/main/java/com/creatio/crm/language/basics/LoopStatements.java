package com.creatio.crm.language.basics;

public class LoopStatements {

	public static void main(String[] args) {
		
		String name = "Omkar";
		
//		System.out.println(name);
//		System.out.println(name);
//		System.out.println(name);
//		System.out.println(name);
//		System.out.println(name);
		
		//Loop Statements ==> Loop the statements / run the same statements again and again by adding additional conditions
		
		
		// for loop ==> used when we know the total number of iterations to be executed before itself.
		
		// for-each loop ==>
		
//		for(condition1 ; condition2 ; condition3) {  //condition1 --> where to start , condition2 --> where to end , condition3 --> Interval 
//			statements;
//		}
		
		for(int i=1; i<=100 ; i+=5 ) {
			System.out.println(i+"."+name);
		}
		
		// while loop ==> used when we don't know the total number of iterations to be executed before.
		
		// do-while loop ==>
		
//		while(condition) {
//			//statements
//		}
		

//		while(1>0) {
//			System.out.println("Refresh the Page");
//		}
		
		int i =1 ;
		
		while (i>0) {
			
			if(i>5)
				break; //break the loop
			
			System.out.println("Refresh the Page");
			i++;
		}

	}

}
