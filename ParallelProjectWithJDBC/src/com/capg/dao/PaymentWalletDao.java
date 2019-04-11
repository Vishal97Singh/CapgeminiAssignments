package com.capg.dao;

import java.util.List;

import com.capg.bean.Customer;

public interface PaymentWalletDao {
	public String createAccount(Customer c);
	public String showBalance(long accountNumber);
	public String deposit(Long accNumber ,double ammount);
	public String withdraw(Long accNumber,double ammount);
	public String fundTransfer(Long sender,Long receiver,double ammount);
	public String transcript(Long accNumber);
	public List<Customer> allCustomers();


}