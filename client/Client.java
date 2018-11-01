package com.zensar.loan.client;

import com.zensar.loan.HomeLoan;
import com.zensar.loan.Loan;

public class Client {
	public static void main(String[] args) {
		HomeLoan homeLoan=new HomeLoan(100000, 8, 1, 10);
		System.out.println(homeLoan.calculateLoanAmount());
		
		//Here Loan reference is created and object of HomeLoan is created parent class ref can point to derived class object
		// but we can only call that menmbers from parent class reference which are present in parent class
		Loan loan=new HomeLoan();
		
		//eg. if there are 2 display method 1 in BC and 2nd in DC at compile time compiler chks whether display method is available in base class 
		// or not if not then it gives error 
		//if display is there in BC then at run time it chks whose object is created here HomeLoan obj is created so homeloan display is called if homeloan dont have display then 
		//BC display is called
		
	/*	Loan l=new HomeLoan();
		l.display()   due to above reason it gives error
		*/
		
		Loan l1=new HomeLoan();
		l1.display();                 // calls home loan display
		
		HomeLoan[] hm=new HomeLoan[5];
		System.out.println("hm :"+hm);
		hm[0]=new HomeLoan();
		System.out.println("hm[0]"+hm[0]);
		System.out.println(hm[0].getInterest());
		
		
		
	//	hm[1]=new Loan(); // here it gives an error cuz we are trying to store loan type object in homeloan 
		// and array allows us to store homogenus elements 
		
		Loan[] l=new Loan[5];// here we have created an array that store loan type object
		l[0]=new Loan(); // here we storeing loan object so it dont give an error
		l[1]=new HomeLoan();// it also works fine cuz home loan is extended from loan so in loan type of array we can store loan type of object as well as its child class object
		
		
		//its valid cuz we are creating loan reference 
		Loan[] l2=new HomeLoan[4];
		l2[0]=new HomeLoan();
		l2[0]=new Loan();
		
		
		
		
		
		
		
	}

}
