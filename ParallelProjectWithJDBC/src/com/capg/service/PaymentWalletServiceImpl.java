package com.capg.service;

import java.util.List;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capg.bean.Customer;
import com.capg.dao.PaymentWalletDao;
import com.capg.dao.PaymentWalletImplDao;

/**
 * 
 * @author Vishal Singh
 *
 */

public class PaymentWalletServiceImpl implements PaymentWalletService {

	PaymentWalletDao pwd=new PaymentWalletImplDao();
	@Override
	/**
	 * Validation for Email
	 */
	public String createAccount(Customer c) {
		String regex="^[A-Za-z0-9+_.-]+@[a-z]{3,6}\\.[a-z]{2,3}";
		Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(c.getEmailId());

	    /**
	     * Validating Input taken from User for Account Creation
	     */
		if(c.getFirstName().length()==0)
			return "Enter a valid name";
		else if(Long.toString(c.getAadharCardNumber()).length()<16 ||Long.toString(c.getAadharCardNumber()).length()>16)
			return "Enter valid AAdhar Number";
		else if(c.getAge()<1)
			return "Age can not be negative";
		else if(Long.toString(c.getMobileNumber()).length()<10 || Long.toString(c.getMobileNumber()).length()>10)
			return "Enter Valid Mobile Number";
		else if(c.getCity().length()==0 || c.getState().length()==0 )
			return "Any Address field should not be Empty";
		else if(Integer.toString(c.getPinCode()).length()<6 || Integer.toString(c.getPinCode()).length()>6)
			return "Enter Valid Pin Code";
		else if(c.getBalance()<0)
			return "Enter valid Amount. Amount can not be Negative";
		else if( matcher.matches()==false) {
			return "Invalid email Id";
		}
		else {
			return pwd.createAccount(c);
		}
	
	}
	@Override
	public String showBalance(long accountNumber) {
		
		 /**
	     * Validating Input taken from User for Showing balance
	     */
		if(Long.toString(accountNumber).length()>16 || Long.toString(accountNumber).length()<16)
		  return "Account Number is Not Valid";
		else
			return pwd.showBalance(accountNumber);
	 
	}
	@Override
	public String deposit(Long accNumber, double ammount){
 
		 /**
	     * Validating Input taken from User to Deposit
	     */
		if(ammount<0) 
			return "Enter valid Ammount";
		else if(Long.toString(accNumber).length()!=16)
			return "Enter Valid Account Number";
		else 
			return pwd.deposit(accNumber, ammount);
	
		
	}
	@Override
	public String withdraw(Long accNumber, double ammount) {
		
		 /**
	     * Validating Input taken from User for Showing balance
	     */
		if( ammount<0) {
			return "Enter valid Ammount";
		}
		else if(Long.toString(accNumber).length()!=16)
			return "Enter Valid Account Number";
		else {
			return pwd.withdraw(accNumber, ammount);	
		}
		
	}
	@Override
	public String transcript(Long accNumber) {
		/**
	     * Validating Account Number taken from User for Showing Transcript
	     */
		 if(Long.toString(accNumber).length()!=16)
			 return "Enter Valid Account Number";
		 else
		     return pwd.transcript(accNumber);
	}
	@Override
	public String fundTransfer(Long sender, Long receiver, double ammount) {
		/**
	     * Validating Sender & Receiver Account Number taken from User for Amount Transfer
	     */
		if(ammount<0) 
			return "Enter Valid Ammount";
		else if(Long.toString(sender).length()!=16)
			return "Enter Valid Sender's Account Number";
		else if(Long.toString(receiver).length()!=16)
			return "Enter Valid Receiver's Account Number";
		else {
		    return pwd.fundTransfer(sender, receiver, ammount);
		}
	}
	@Override
	public List<Customer> allCustomers() {
		/**
	     * Return List of All Customers having account
	     */
		return pwd.allCustomers();
	}
}
