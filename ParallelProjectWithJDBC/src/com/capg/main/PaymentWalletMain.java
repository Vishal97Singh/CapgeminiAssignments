package com.capg.main;

import java.util.List;
/**
 * @author Vishal Singh
 */
import java.util.Scanner;

import com.capg.bean.Customer;
import com.capg.service.PaymentWalletService;
import com.capg.service.PaymentWalletServiceImpl;

public class PaymentWalletMain {
	public static void main(String args[]) {
		PaymentWalletService pws=new PaymentWalletServiceImpl();
		
		Long accountNumber;
		String firstName=null;
		String lastName=null;
		int age;
		Long aadharNumber;
		Long MobileNumber;
		String emailId;
		String city;
		String state;
		int pin;
		double initialBalance;
		
		
		Customer cust=null;
		Long accNumber;
		Scanner sc=new Scanner(System.in);
	   
		/**
		 * List of Modules
		 */
		while(true) {
		System.out.println(" 1. Create Account\n 2. Show Balance\n 3. Deposit\n 4. Withdraw\n 5. Transfer\n 6. Transcript\n 7. Show All Customers\n 8. Exit");
		System.out.println("Enter Your Choice");
		int choice=sc.nextInt();
		
		
		switch(choice) {
		case 1: long Number =(long) (Math.random() * 10000000000000L);
		        accountNumber = 2200000000000000L +Number;
			    System.out.println("Enter First Name");
		        firstName=sc.next();
		        
		        System.out.println("Enter Last Name");
		        lastName=sc.next();
		        
		        System.out.println("Enter Age");
		        age=sc.nextInt();
		        
		        System.out.println("Enter 16 digit AadharCard Number");
		        aadharNumber=sc.nextLong();
		        
		        System.out.println("Enter Mobile Number");
		        MobileNumber=sc.nextLong();
		        
		        System.out.println("Enter Email Id");
		        emailId=sc.next();
		       
		        System.out.println("Enter City");
		        city=sc.next();
		        
		        System.out.println("Enter State");
		        state=sc.next();
		        
		        System.out.println("Enter 6 digit PIN Code");
		        pin=sc.nextInt();
		       
		        System.out.println("Enter Initial Ammount");
		        initialBalance=sc.nextDouble();
	
		        cust=new Customer(accountNumber,firstName, lastName,age, aadharNumber, MobileNumber,
						emailId, city, state, pin,initialBalance);
			try {
				
				//Create Account
				System.out.println(pws.createAccount(cust));
			} catch (Exception e) {
				e.printStackTrace();
			}
		        break;
		case 2: System.out.println("Enter Account Number");
		        Long acc=sc.nextLong();
			
			try {
				
				//Print balance available in account
				System.out.println(pws.showBalance(acc));
			} catch (Exception e1) {
		
				e1.printStackTrace();
			}
			 
		        break;
		case 3: System.out.println("Enter Amount to be deposited");
		        double amountDeposit=sc.nextDouble();
		        System.out.println("Enter Account Number");
		        accNumber=sc.nextLong();
			try {
				
				//Deposing amount in Account
				System.out.println(pws.deposit(accNumber, amountDeposit));
			} catch (Exception e) {
				e.printStackTrace();
			}
		        break;
		case 4: System.out.println("Enter Amount to be deposited");
                double amountWithdraw=sc.nextDouble();
                System.out.println("Enter Account Number");
		        accNumber=sc.nextLong();
			try {
				
				//Withdrawing balance from account
				System.out.println(pws.withdraw(accNumber, amountWithdraw));
			} catch (Exception e) {
				e.printStackTrace();
			}
		        break;
		case 5: System.out.println("Enter Your Account Number");
		        long sender=sc.nextLong();
		        System.out.println("Enter Receiver's Account Number");
		        Long receiver=sc.nextLong();
		        System.out.println("Enter Amount");
		        double amt=sc.nextDouble();
			try {
				//Transferring amount from one account to another
				System.out.println(pws.fundTransfer(sender, receiver, amt));
			} catch (Exception e) {
				e.printStackTrace();
			}
		        break;
		case 6: System.out.println("Enter Account Number");
                accNumber=sc.nextLong(); 
			try {
				//Print Transcript
				System.out.println(pws.transcript(accNumber));
			} catch (Exception e) {
			
				e.printStackTrace();
			}
		        break;
		case 7: List<Customer> li;             
			try {
				li = pws.allCustomers();
				/**
				 * Printing details of Account Holders through forEach
				 */
				 li.forEach((c)->{         
		        	 System.out.println(c.getAccountNumber()+"\t"+c.getFirstName()+"\t"+c.getLastName()+"\t"+c.getAge()+"\t"+c.getBalance()+"\t"+c.getCity());
		         });
			} catch (Exception e) {
			
				e.printStackTrace();
			}
	           break;
		case 8: System.out.println("Thank You");  
			    return;                               //Exit From System
		default: System.out.println("Invalid Choice");
		}
		}
	
	}

}
