package com.capg.main;

import java.util.List;
import java.util.Scanner;

import com.capg.bean.Customer;
import com.capg.service.PaymentWalletService;
import com.capg.service.PaymentWalletServiceImpl;

public class PaymentWalletMain {
	public static void main(String args[]) {
		PaymentWalletService pws=new PaymentWalletServiceImpl();
		
		String firstName=null;
		String lastName=null;
		int age;
		Long aadharNumber;
		Long MobileNumber;
		String emailId;
		String houseNumber;
		String city;
		String state;
		int pin;
		String country;
		double initialBalance;
		
		
		Customer cust=null;
		Long accNumber;
		Scanner sc=new Scanner(System.in);
	    String ch="Yes";
		while(true) {
		System.out.println(" 1. Create Account\n 2. Show Balance\n 3. Deposit\n 4. Withdraw\n 5. Transfer\n 6. Transcript\n 7. Show All Customers\n 8. Exit");
		int choice=sc.nextInt();
		
		
		switch(choice) {
		case 1: System.out.println("Enter First Name");
		        firstName=sc.next();
		        System.out.println("Enter Last Name");
		        lastName=sc.next();
		        System.out.println("Enter Age");
		        age=sc.nextInt();
		        System.out.println("Enter AadharCard Number");
		        aadharNumber=sc.nextLong();
		        System.out.println("Enter Mobile Number");
		        MobileNumber=sc.nextLong();
		        System.out.println("Enter Email Id");
		        emailId=sc.next();
		        System.out.println("Enter House Number");
		        houseNumber=sc.next();
		        System.out.println("Enter City");
		        city=sc.next();
		        System.out.println("Enter State");
		        state=sc.next();
		        System.out.println("Enter PIN Code");
		        pin=sc.nextInt();
		        System.out.println("Enter Country");
		        country=sc.next();
		        System.out.println("Enter Initial Ammount");
		        initialBalance=sc.nextDouble();
	
		        cust=new Customer(firstName, lastName,age, aadharNumber, MobileNumber,
						emailId, houseNumber, city, state, pin, country,initialBalance);
			    System.out.println(pws.createAccount(cust));
		        break;
		case 2: System.out.println("Enter Account Number");
		        accNumber=sc.nextLong();
			    System.out.println(pws.showBalance(accNumber));
		        break;
		case 3: System.out.println("Enter Amount to be deposited");
		        double amountDeposit=sc.nextDouble();
		        System.out.println("Enter Account Number");
		        accNumber=sc.nextLong();
			    System.out.println(pws.deposit(accNumber, amountDeposit));
		        break;
		case 4: System.out.println("Enter Amount to be deposited");
                double amountWithdraw=sc.nextDouble();
                System.out.println("Enter Account Number");
		        accNumber=sc.nextLong();
			    System.out.println(pws.withdraw(accNumber, amountWithdraw));
		        break;
		case 5: System.out.println("Enter Your Account Number");
		        long sender=sc.nextLong();
		        System.out.println("Enter Receiver's Account Number");
		        Long receiver=sc.nextLong();
		        System.out.println("Enter Amount");
		        double amt=sc.nextDouble();
			    System.out.println(pws.fundTransfer(sender, receiver, amt));
		        break;
		case 6: System.out.println("Enter Account Number");
                accNumber=sc.nextLong(); 
			    System.out.println(pws.transcript(accNumber));
		        break;
		case 7: List<Customer> li=pws.allCustomers();
		         li.forEach((c)->{
		        	 System.out.println(c.getAccountNumber()+"\t"+c.getFirstName()+"\t"+c.getLastName()+"\t"+c.getAge()+"\t"+c.getBalance());
		         });
		      
	           break;
		case 8: System.out.println("Thank You");
			    return;
		default: System.out.println("Invalid Choice");
		}
		}
	
	}

}
