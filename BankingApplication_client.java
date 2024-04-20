package com.tka.account;

public class Client2 {

	public static void main(String[] args) {
		BankingApplication yash = new BankingApplication("prasad","4444",900,"8888888888","121212","prasad1234");
		yash.PrintAccountHolderInfo();
		BankingApplication dinesh = new BankingApplication("Dinesh","4445",800,"8888889999","232323","dinesh1234");
	    dinesh.PrintAccountHolderInfo();
	    BankingApplication piyush = new BankingApplication("piyush","5555",700,"9999999999","5555555","piyush1234");
	    piyush.deposit(600);
	    piyush.checkBalance();
	    piyush.withdraw(60);
	    piyush.PrintAccountHolderInfo();
	

	}

}
