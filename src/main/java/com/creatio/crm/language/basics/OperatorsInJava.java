package com.creatio.crm.language.basics;

public class OperatorsInJava {

//	Operators in Java

//	1. Arithmetic Operators (+, -, *, /, %, ++ (increment by 1), -- (decrement by 1)) (Special chars used to perform mathematical operations)
//	2. Assignment Operators (=,+=,-=,*=,/=,%=)  (Special chars used to assign value to variable)
//	3. Conditional Operators (==, !=, >, <, >=, <= ) (Special chars used to compare primitive values)
//	4. Logical Operators (&&, ||, ! ) (Special chars used to build conditions)
//	5. Ternary Operator	 ( ? --> Used as a shorthand for if-else statements.)

	public static void main(String[] args) {
		
		//Auto Boxing		
		int x = 5;
		Integer y = x;
		
		//Un-boxing
		int z =y;

		System.out.println("*******Arithmetic Operators********");
		int a = 10;
		int b = 20;
		
		System.out.println(a++); //post-increment (increase the value by 1 after execution of statement)
		System.out.println(a);		
		System.out.println(++b); //pre-increment (increase the value by 1 before the execution of statement)
		
		System.out.println(a--); //post-decrement
		System.out.println(--b); //pre-decrement 
		
		System.out.println("*******Assignment Operators********");
		int c = 10;
		
		c+=5;//c=c+5
		System.out.println(c);
		
		c-=3;//c=c-3
		System.out.println(c);
		
		c%=3;//c=c%3
		System.out.println(c);
		
		System.out.println("*******Conditional Operators********");
		
		int d = 10;
		int e = 20;
		
		System.out.println(d==e);
		System.out.println(d!=e);
		System.out.println(d>e);
		System.out.println(d<e);
		
		System.out.println("*******Logical Operators********");
//		int x = 10;
//		int y = 20;
//		int z = 10;
		
		System.out.println(x>y &&  x==z); //false and true = false
		
		System.out.println(x>y ||  x==z); //false or true = true
		
		System.out.println(!(x>y ||  x==z)); // not (false or true) = not (true) = false
		
		System.out.println("*******Ternary Operator********");
		//syntax: (condition) ? true : false
		
		int i = 30;
		int j = 20;
		
		int k = (i > j) ? i : j;
		System.out.println(k);
		
		String name1 = "Bharath";
		String name2 ="Sarath";
		
		boolean result = (name1.equals(name2))? true : false;
		System.out.println(result);
		
	}

}
