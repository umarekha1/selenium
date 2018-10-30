package com.HDFC.loans.educationloans;


public class HDFC implements Rbi
{

	
	public static void main(String[] args)
	{
		HDFC h=new HDFC();
		h.deposit();
		h.withdrawl();
		
		

	}

	@Override
	public void withdrawl() {
		System.out.println("Hi iam withdrawl implemented in HDFC");
	
	}

	@Override
	public void deposit() {
		System.out.println("Hi iam deposit implemented in HDFC");
		
		
	}

}
