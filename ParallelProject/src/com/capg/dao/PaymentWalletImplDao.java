package com.capg.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.capg.bean.Customer;

public class PaymentWalletImplDao implements PaymentWalletDao{

	Map<Long,Double> accBalance=new HashMap<Long,Double>();
	List<Customer> li=new ArrayList<Customer>();
	@Override
	public String createAccount(Customer c) {
		li.add(c);
	
		for(Customer l:li) {
			l.setTransaction(c.getBalance()+" RS Deposited on "+new Date());
		}
		System.out.println();
		accBalance.put(c.getAccountNumber(), c.getBalance());
		return "Account Created "+c.getFirstName();
		
	}
	@Override
	public String showBalance(long accountNumber) {

		for(Customer c:li) {
			if(c.getAccountNumber()==accountNumber) {
				return "Balance :"+c.getBalance();
			}
		}
		return "Account Not Found";
	}
	@Override
	public String deposit(Long accNumber,double ammount) {
		for(Customer l:li) {
			if(l.getAccountNumber()==accNumber) {
				double a=l.getBalance()+ammount;
				l.setBalance(a);
				l.setTransaction(ammount+" RS Deposited on "+new Date());
				 return ammount+" deposited";
			}
			
		}
		return "Account does not exisr";

	}
	@Override
	public String withdraw(Long accNumber, double ammount) {
		for(Customer l:li) {
			if(l.getAccountNumber()==accNumber) {
				double a=l.getBalance()-ammount;
				l.setTransaction(ammount+" RS Withdrawn on "+new Date());
				l.setBalance(a);
			}
		}
	
		return ammount+" Withdrawn";
	}
	@Override
	public String transcript(Long accNumber) {	     
	     for(Customer l:li) {
	    	 if(l.getAccountNumber()==accNumber) {
	    		 return l.getTransaction();
	    	 }
	     }
	     return "Account Not Found";
	}
	@Override
	public String fundTransfer(Long sender,Long receiver, double ammount) {
		for(Customer l:li) 
		{
			if(l.getAccountNumber()==sender) 
			{
				for(Customer l1:li) 
				{
					if(l1.getAccountNumber()==receiver) 
					{
						if(l.getBalance()>ammount) 
						{
							double a=l.getBalance()-ammount;
							double b=l1.getBalance()+ammount;
							l.setBalance(a);
							l1.setBalance(b);
							l.setTransaction(a+" RS Withdrawn on "+new Date());
							l1.setTransaction(a+" RS Deposited on "+new Date());
							return ammount+" deposited to "+receiver;
						}
						else
						{
							return "Insufficient Balance";
						}
					}
					
				}
			}
			
		}
		return "Account Not Matching";
		
	}
	@Override
	public List<Customer> allCustomers() {
		return li;
	}

}
