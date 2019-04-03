package com.capg.service;

import java.util.List;

import com.capg.bean.Customer;

public interface PaymentWalletService {
	public String createAccount(Customer c) throws Exception;
	public String showBalance(long accountNumber)throws Exception;
	public String deposit(Long accNumber,double ammount)throws Exception;
	public String withdraw(Long accNumber,double ammount)throws Exception;
	public String fundTransfer(Long sender,Long receiver,double ammount)throws Exception;
	public String transcript(Long accNumber)throws Exception;
	public List<Customer> allCustomers()throws Exception;

}
