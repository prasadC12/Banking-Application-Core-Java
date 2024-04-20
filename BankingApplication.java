package com.tka.account;

public class BankingApplication {
	public static String bankname = " Tka Bank";
	public static String ifscCode = " Tka22890 ";
	public static String bankAddress = " Near karve nagar";
	public static String bankContactNumber = " 7304818915 ";
	
	private String accountholderName;
	private String accountNumber;
	private double balance ;
	private String contactNumber1;
	private String adharNumber;
	private String panNumber;
	BankingApplication(String accountholderName,String accountNumber,double balance,String contactNumber1,String adharNumber,String panNumber) {
		this.accountholderName = accountholderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		if (balance >= 500){
			this.balance = balance;
		}
		else {
			this.balance = 500;
			
		}
		this.contactNumber1 = contactNumber1;
		this.adharNumber = adharNumber;
		this.panNumber = panNumber;
	}

	public String getAccountholderName() {
		return accountholderName;
	}

	public void setAccountholderName(String accountholderName) {
		this.accountholderName = accountholderName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getContactNumber1() {
		return contactNumber1;
	}

	public void setContactNumber1(String contactNumber1) {
		this.contactNumber1 = contactNumber1;
	}

	public String getAdharNumber() {
		return adharNumber;
	}

	public void setAdharNumber(String adharNumber) {
		this.adharNumber = adharNumber;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	
	public double checkBalance() {
		return this.balance;
	}
	public void deposit(double amount) {
		if (amount > 0) {
			this.balance = this.balance + amount;
		}
	}
	public void withdraw (double amount) {
		if (amount < this.balance && amount > 0) {
			this.balance = this.balance - amount;
		}
		else {
			System.out.println(" your amount is to low to withdraw !!!");
		}
	}
	public void PrintAccountHolderInfo(){
	System.out.println(" BANK NAME IS : " +bankname);
	System.out.println(" IFSC CODE IS : " +ifscCode);
	System.out.println(" BANK ADDRESS IS : " + bankAddress);
	System.out.println(" BANK CONTACT NUMBER IS : " + bankContactNumber);
	System.out.println(" ACCOUNT HOLDER NAME IS : " + this.accountholderName);
	System.out.println(" ACCOUNT NUMBER IS : " + this.accountNumber);
	System.out.println(" CHECK BALANCE : " + this.balance);
	System.out.println(" Current Balance IS : " + this.balance);
	System.out.println(" CONTACT NUMBER IS : " + this.contactNumber1);
	System.out.println(" ADHAR NUMBER IS : " + this.adharNumber);
	System.out.println(" PAN NUMBER IS : "  + this.panNumber);
	System.out.println("______________________________________________");
	}
}
