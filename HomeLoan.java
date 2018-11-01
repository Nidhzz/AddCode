package com.zensar.loan;

public class HomeLoan extends Loan {
	
	private int tenure;
	

	public HomeLoan() {
		super();
	}

	public HomeLoan(int loanAmount, double interest, int loanId, int tenure) {
		//WAY 1 ----- 
		//super(loanAmount, interest, loanId);
		//WAY 2 -----
		setLoanAmount(loanAmount);
		setLoanId(loanId);
		setInterest(interest);
		this.tenure = tenure;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public double calculateLoanAmount()
	{
		return getInterest()*getLoanAmount()*tenure;
	}
	
	public void display()
	{
		System.out.println("Home Loan display");
	}
}
