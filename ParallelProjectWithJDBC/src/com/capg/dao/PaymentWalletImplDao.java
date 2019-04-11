package com.capg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import com.capg.bean.Customer;
import com.capg.utility.MyConnection;

/**
 * 
 * @author Vishal Singh
 *
 */

public class PaymentWalletImplDao implements PaymentWalletDao{
	
	// Connection Creation
	Connection con=MyConnection.getonnection();
	
	PreparedStatement ps,ps1;
	Statement st;
	
	/**
	 * Method for Account Creation in the database
	 */
	@Override
	public String createAccount(Customer c) {
		String result="";
		try {
			
			//Row Insertion in Account table
			ps=con.prepareStatement("insert into Account values(?,?,?,?,?,?,?,?,?,?,?) ");
		    ps.setLong(1, c.getAccountNumber());
		    ps.setString(2, c.getFirstName());
		    ps.setString(3, c.getLastName());
		    ps.setInt(4, c.getAge());
		    ps.setLong(5, c.getMobileNumber());
		    ps.setString(6, c.getEmailId());
		    ps.setString(7, c.getCity());
		    ps.setString(8, c.getState());
		    ps.setInt(9, c.getPinCode());
		    ps.setDouble(10, c.getBalance());
		    ps.setLong(11, c.getAadharCardNumber());
		    
		    //Query Execution
		    int x=ps.executeUpdate();
		    if(x!=0) {
		    	String s="Credited With Rs. "+c.getBalance()+" on "+new Date();
		    	c.setTransaction(s);
		    	
		    	  ps1=con.prepareStatement("insert into Transcript values(?,?)");
				  ps1.setLong(1,c.getAccountNumber());
				  ps1.setString(2, c.getTransaction());
				  ps1.execute();
				  
		    	result="Account Created With Name :"+c.getFirstName()+" and Account_Number:"+c.getAccountNumber();
		    }
		    else {
		    	result="Unable to create an Account. \nTry Next Time ";
		    }
		    
		  
		} catch (SQLException e) {
			e.printStackTrace();
		}
	   
		  return result;
		
	}
	
	/**
	 * Method to Show balance as per Account Number
	 */
	@Override
	public String showBalance(long accountNumber) {
		String result="";
		try {
			ps=con.prepareStatement("Select balance from Account where Account_Number=?");
			ps.setLong(1, accountNumber);
			ResultSet rs=ps.executeQuery();
			rs.next();
				result="balance :"+"\t"+rs.getDouble(1);
			
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}
	
	/**
	 * Method to Deposit Balance in Account table
	 */
	@Override
	public String deposit(Long accNumber,double amount) {
		String result="";
		String s="";
		try {
		ps=con.prepareStatement("Update Account set balance=balance+? where Account_Number=? ");
		ps.setDouble(1, amount);
		ps.setLong(2, accNumber);
		
		int x=ps.executeUpdate();
		
		if(x!=0) {
			s="Credited with "+amount+" on "+new Date();
			result="Account No. "+accNumber+" Credited With "+amount;
			
			ps1=con.prepareStatement("insert into Transcript values(?,?)");
			  ps1.setLong(1,accNumber);
			  ps1.setString(2,s);
			  ps1.execute();
		}
		else {
			result="Account No. does not Found";
		}
		  
	   
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;	
	}
	
	/**
	 * Method to Withdraw Amount from Account table
	 */
	@Override
	public String withdraw(Long accNumber, double amount) {
		String result="";
		String s="";
		try {
			ps=con.prepareStatement("Update Account set Balance=Balance-? where Account_Number=? ");
			ps.setDouble(1, amount);
			ps.setLong(2, accNumber);
			
			int x=ps.executeUpdate();
			if(x!=0) {
				s="Debited with "+amount+" on "+new Date();
				result="Account No. "+accNumber+" Debited with "+amount;
				ps1=con.prepareStatement("insert into Transcript values(?,?)");
				  ps1.setLong(1,accNumber);
				  ps1.setString(2,s);
				  ps1.execute();
			}
			else {
				result="Account No. does not Found";
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}
	
	/**
	 * Method to print Transcript as per Account Number
	 */
	@Override
	public String transcript(Long accNumber) {
		String result="";
		try {
		    ps=con.prepareStatement("Select Account_Number,Transaction from Transcript where Account_Number=?");
		   
			ps.setLong(1, accNumber);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				  result+=rs.getString(2)+"\n";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	     return "\n"+result;
	}
	
	/**
	 * Method for transferring amount from one account to another
	 */
	@Override
	public String fundTransfer(Long sender,Long receiver, double amount) {
		String result="";
		String s="";
		
		try {
			ps=con.prepareStatement("select balance from Account where Account_Number=?");
			ps.setDouble(1, sender);
			ResultSet rs=ps.executeQuery();
			rs.next();
			if(rs.getDouble(1)>amount)
			{
			 ps=con.prepareStatement("update Account set balance=balance-? where Account_Number=?");
			 ps.setDouble(1, amount);
			 ps.setLong(2, sender);
			 int x=ps.executeUpdate();
			
			
		      PreparedStatement ps2=con.prepareStatement("update Account set balance=balance+? where Account_Number=?");
			  ps2.setDouble(1, amount);
			  ps2.setLong(2, receiver);
			  int y=ps2.executeUpdate();
			
		      if(x!=0 && y!=0) {
				result=amount+" Transferred to "+receiver+" From "+sender;
				
				s="Debited with "+amount+" on "+new Date();
				ps1=con.prepareStatement("insert into Transcript values(?,?)");
				  ps1.setLong(1,sender);
				  ps1.setString(2,s);
				  ps1.execute();
				 
				String s1="Credited with "+amount+" on "+new Date();
				PreparedStatement ps3=con.prepareStatement("insert into Transcript values(?,?)");
				  ps3.setLong(1,receiver);
				  ps3.setString(2,s1);
				  ps3.execute();
			    }
			     else {
			     	result="Sender or Receiver Account Not Found";
			  }
			}
		      else {
		    	  result="Not Sufficient Balance";
		      }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
		
	}
	
	/**
	 * Method to display all Account Holder's details
	 */
	@Override
	public List<Customer> allCustomers() {
		List<Customer> li=new ArrayList<Customer>();
		try {
			ps=con.prepareStatement("Select * from Account");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Customer c=new Customer();
				
				Long acc=rs.getLong(1);
				c.setAccountNumber(acc);
				
				String fname=rs.getString(2);
				c.setFirstName(fname);
				
				String lname=rs.getString(3);
				c.setLastName(lname);
				
				int age=rs.getInt(4);
				c.setAge(age);
				
				Long mob=rs.getLong(5);
				c.setMobileNumber(mob);
				
				String email=rs.getString(6);
				c.setEmailId(email);
				
				String city=rs.getString(7);
				c.setCity(city);
				
				String state=rs.getString(8);
				c.setState(state);
				
				int pin=rs.getInt(9);
				c.setPinCode(pin);
				
				double balance=rs.getDouble(10);
				c.setBalance(balance);
				
				Long adhar=rs.getLong(11);
				c.setAadharCardNumber(adhar);
				
				li.add(c);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return li;
	}

}
