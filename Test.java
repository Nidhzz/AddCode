package com.zensar.superexample;

public  class Test 
{
	public static void main(String[] args)
	{
		// in constuctor by default super() is added i.e constuctor of super class with no argument is executed
		// first subclass constructor is called then super class constructor is called but 1st super class const. is executed then sub class const is exe
				
		SubClass sc=new SubClass();
		
		//if we write any parameterized const. in super class but there is no default const there then it gives error in sub class const because in sub class const. super() is added i.e it calls no arg. const 
		// of super class  which is not present
		
		// but if we pass parameter to super it wont give error
		
		
		
		
	}

}
