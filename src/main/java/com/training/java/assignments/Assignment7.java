package com.training.java.assignments;

public class Assignment7 {
	public static void main(String[] args) {
		// Store transactions in an array
		int[] transactions = { 50000, -2000, 3000, -15000, -200, -300, 4000, -3000 };

		// Variables to store totals
		int totalCredits = 0;
		int totalDebits = 0;
		int totalCreditAmount = 0;
		int totalDebitAmount = 0;
		int suspiciousTransactions = 0;

		// Process transactions
		for (int amount : transactions) {
			if (amount > 0) { // Credit
				totalCredits++;
				totalCreditAmount += amount;
				if (amount > 10000) {
					System.out.println("Suspicious credit transaction with Amount: " + amount);
					suspiciousTransactions++;
				}
			} else { // Debit
				totalDebits++;
				totalDebitAmount += Math.abs(amount);
				if (amount < -10000) {
					System.out.println("Suspicious debit transaction with Amount: " + Math.abs(amount));
					suspiciousTransactions++;
				}
			}
		}

		// Calculate the final remaining amount in the account
		int finalBalance = totalCreditAmount - totalDebitAmount;

		// Output the results
		System.out.println("Total number of credit transactions: " + totalCredits);
		System.out.println("Total number of debit transactions: " + totalDebits);
		System.out.println("Total amount credited: " + totalCreditAmount);
		System.out.println("Total amount debited: " + totalDebitAmount);
		System.out.println("Final remaining amount in the account: " + finalBalance);
		System.out.println("Total number of suspicious transactions: " + suspiciousTransactions);
	}
}
