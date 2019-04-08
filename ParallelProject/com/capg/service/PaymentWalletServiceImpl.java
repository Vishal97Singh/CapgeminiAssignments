package com.capg.service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capg.bean.Customer;
import com.capg.bean.CustomerException;
import com.capg.dao.PaymentWalletDao;
import com.capg.dao.PaymentWalletImplDao;

public class PaymentWalletServiceImpl implements PaymentWalletService {
	
	public static boolean validateNames(String txt) {
	    String regx = "[a-zA-Z]+\\.?";
	    Pattern pattern = Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(txt);
	    return matcher.find();
	}

	PaymentWalletDao pwd=new PaymentWalletImplDao();
	@Override
	public String createAccount(Customer c) {
		String regex="^[A-Za-z0-9+_.-]+@[a-z]{3,10}\\.[a-z]{2,7}";
		Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(c.getEmailId());

	    
		if(!validateNames(c.getFirstName()) || c.getFirstName().length()<1)
			return "Enter a valid First Name";
		else if(!validateNames(c.getLastName()) || c.getLastName().length()<1)
			return "Enter a valid Last Name";
		else if(Long.toString(c.getAadharCardNumber()).length()!=16)
			return "Enter valid AAdhar Number";
		else if(c.getAge()<1)
			throw new CustomerException("Age Should not be Zero or Less");
		else if(Long.toString(c.getMobileNumber()).length()!=10)
			throw new CustomerException("Enter Valid Mobile Number");
		else if(c.getCity().length()==0 || c.getState().length()==0 )
			throw new CustomerException("Any Address field should not be Empty");
			//return "Any Address field should not be Empty";
		else if(Integer.toString(c.getPinCode()).length()<6 || Integer.toString(c.getPinCode()).length()>6)
			throw new CustomerException("return \"Enter Valid Pin Code");
			//return "Enter Valid Pin Code";
		else if( matcher.matches()==false) {
			return "Invalid email Id";
		}
		else {
			return pwd.createAccount(c);
		}
	
	}
	@Override
	public String showBalance(long accountNumber) {
		if(Long.toString(accountNumber).length()>16 || Long.toString(accountNumber).length()<16)
		  return "Account Number is Not Valid";
		else
			return pwd.showBalance(accountNumber);
	 
	}
	@Override
	public String deposit(Long accNumber, double ammount) {
 
		if(ammount<0) 
			return "Enter valid Ammount";
		else 
			return pwd.deposit(accNumber, ammount);
	
		
	}
	@Override
	public String withdraw(Long accNumber, double ammount) {
		
		if( ammount<0) {
			return "Enter valid Ammount";
		}
		else {
			return pwd.withdraw(accNumber, ammount);	
		}
		
	}
	@Override
	public String transcript(Long accNumber) {
		
		return pwd.transcript(accNumber);
	}
	@Override
	public String fundTransfer(Long sender, Long receiver, double amount) {
		
		if(amount<0) {
			return "Amount can not be Negative";
		}
		else if(sender==receiver) {
			return "Sender and Receiver Account Number can not be same";
		}
		else if(Long.toString(sender).length()!=16 || Long.toString(receiver).length()!=16)
			return "Enter valid Sender and Receiver Account Number";
		else {
		    return pwd.fundTransfer(sender, receiver, amount);
		}
	}
	@Override
	public List<Customer> allCustomers() {
	
		return pwd.allCustomers();
	}
}
