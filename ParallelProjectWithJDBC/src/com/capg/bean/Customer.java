package com.capg.bean;
/**
 * 
 * @author Vishal Singh
 *
 */

public class Customer {
	private String firstName;
	private String lastName;
	private int age;
	private long aadharCardNumber;
	private long mobileNumber;
	private String emailId;
	private String city;
	private String State;
	private int pinCode;
	private double balance;
	private long accountNumber;
	
	// It will store transaction amount and time of Each customer
	private String transactionTime="";
	
		
	// Default Constructor
	public Customer() {
		
	}
	
	//Parameterized Constructor
	public Customer(Long accountNumber,String firstName, String lastName, int age, long aadharCardNumber, long mobileNumber,
			String emailId, String city, String state, int pinCode,double balance) {
		super();
		this.accountNumber=accountNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.aadharCardNumber = aadharCardNumber;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.city = city;
		State = state;
		this.pinCode = pinCode;
		this.balance=balance;	
	}
	
	
	/**
	 *Getter and Setter methods
	 */
	public void setTransaction(String s) {
		transactionTime=transactionTime+"\n"+s;
	}
	public String getTransaction() {
		return transactionTime;
	}
	
	
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getAadharCardNumber() {
		return aadharCardNumber;
	}

	public void setAadharCardNumber(long aadharCardNumber) {
		this.aadharCardNumber = aadharCardNumber;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	/*@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", Account Number=" + accountNumber + ", age=" + age + ", aadharCardNumber="
				+ aadharCardNumber + ", mobileNumber=" + mobileNumber + ", emailId=" + emailId + ", houseNumber="
				+ houseNumber + ", city=" + city + ", State=" + State + ", pinCode=" + pinCode + ", Country=" + Country
				+" Balance=" + balance+"]";
	}*/
}
