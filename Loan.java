package com.zensar.loan;

public class Loan {
	
		private int loanAmount;
		private double interest;
		private int loanId;
		
		
		
		public Loan() {
		
		}



		public Loan(int loanAmount, double interest, int loanId) {
			
			this.loanAmount = loanAmount;
			this.interest = interest;
			this.loanId = loanId;
		}



		public int getLoanAmount() {
			return loanAmount;
		}



		public void setLoanAmount(int loanAmount) {
			this.loanAmount = loanAmount;
		}



		public double getInterest() {
			return interest;
		}



		public void setInterest(double interest) {
			this.interest = interest;
		}



		public int getLoanId() {
			return loanId;
		}



		public void setLoanId(int loanId) {
			this.loanId = loanId;
		}
		
		public void display()
		{
			System.out.println("Loan Display");
		}
		
		

}
