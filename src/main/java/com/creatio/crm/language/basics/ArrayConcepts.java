package com.creatio.crm.language.basics;

public class ArrayConcepts {

	public static void main(String[] args) {
		
		String [] empNames = new String [3];
		empNames[0] = "Amit";
		empNames[1] = "Anurag";
		empNames[2] = "Devi";
//		empNames[3] = "Bharath";
		
		
		String [] [] empGroups = new String [3] [2] ;
		
		empGroups[0][0] = "Amit";
		empGroups[0][1] = "Trivin";		
		empGroups[1][1] = "Geetha";
		
		String [] [] [] empGroups2 = {{ {"Amit","Ananth"}, {"Geetha","Devi"}, {"Sumit","Bharath"}}, { {"Amit","Ananth"}, {"Geetha","Devi"}, {"Sumit","Bharath"}}};
		
		
		
		String [] [] [] empRoleGroups = new String [3] [2] [3] ;
		
		empRoleGroups[0][0][0] = "Developer 1";
		empRoleGroups[0][1][0] = "Tester 1";
		
		empRoleGroups[1][0][0] = "Developer 2";
		empRoleGroups[1][1][0] = "Tester 2";
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
