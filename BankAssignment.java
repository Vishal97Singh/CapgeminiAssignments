package lab2;
import java.util.*;
import java.io.*;
abstract class Account{
	double interestRate;
	double amount;
	public Account(double interestRate, double amount) {
		super();
		this.interestRate = interestRate;
		this.amount = amount;
	}
	abstract double calculateInterest();
}

class FDAccount extends Account{
	int number_of_days;
	int age;
	
	public FDAccount(double interestRate, double amount, int number_of_days, int age) {
		super(interestRate, amount);
		this.number_of_days = number_of_days;
		this.age = age;
	}

	public double calculateInterest() {
		double am=0.0;
		try {
			if(number_of_days<0)
				throw new Exception();
		}catch(Exception e) {
			System.out.println("Invalid Number of days..it should be in range of 1-366");
		}
		try {
			if(amount<0)
				throw new Exception();
		}catch(Exception e) {
			System.out.println("Invalid Amount..It should be more than 0");
		}
		try {
			if(age<0 || age>110)
				throw new Exception();
		}catch(Exception e) {
			System.out.println("Invalid Age..Insert between 0-110");
		}
	
		if(amount<10000000 && amount>0) {
			if(age<60) {
				if(number_of_days>=7 && number_of_days<=14) {
					am= (amount*4.50)/100;
				}
				if(number_of_days>=15 && number_of_days<=29) {
					am= (amount*4.75)/100;
				}
				if(number_of_days>=30 && number_of_days<=45) {
					am= (amount*5.50)/100;
				}
				if(number_of_days>=46 && number_of_days<=60) {
					am= (amount*7.00)/100;
				}
				if(number_of_days>=61 && number_of_days<=184) {
					am= (amount*7.50)/100;
				}
				if(number_of_days>=185 && number_of_days<=366) {
					am= (amount*8.00)/100;
				}
			else {
					if(number_of_days>=7 && number_of_days<=14) {
						am= (amount*5.00)/100;
					}
					if(number_of_days>=15 && number_of_days<=29) {
						am= (amount*5.25)/100;
					}
					if(number_of_days>=30 && number_of_days<=45) {
						am= (amount*6.00)/100;
					}
					if(number_of_days>=46 && number_of_days<=60) {
						am= (amount*7.50)/100;
					}
					if(number_of_days>=61 && number_of_days<=184) {
						am= (amount*8.00)/100;
					}
					if(number_of_days>=185 && number_of_days<=366) {
						am= (amount*8.50)/100;
					}
			     }
		}
		else {
				if(number_of_days>=7 && number_of_days<=14) {
					am= (amount*6.50)/100;
				}
				if(number_of_days>=15 && number_of_days<=29) {
					am= (amount*6.75)/100;
				}
				if(number_of_days>=30 && number_of_days<=45) {
					am= (amount*6.75)/100;
				}
				if(number_of_days>=46 && number_of_days<=60) {
					am= (amount*8.00)/100;
				}
				if(number_of_days>=61 && number_of_days<=184) {
					am= (amount*8.50)/100;
				}
				if(number_of_days>=185 && number_of_days<=366) {
					am= (amount*10.00)/100;
				}
		}
			
		}
		return am;	
	}
}

class SBAccount extends Account{
	String type_of_account;
	public SBAccount(double interestRate, double amount, String type_of_account) {
		super(interestRate, amount);
		this.type_of_account=type_of_account;
	}
	public double calculateInterest() {
		double am=0.0;
		if(type_of_account.equalsIgnoreCase("Normal"))
			am= (amount*4.0)/100;
		else
		if(type_of_account.equalsIgnoreCase("NRI"))
		     am=(amount*6.0)/100;
		return am;	
	}
	
}

class RDAccount extends Account{
	int number_of_month;
	double monthly_amount;
	int age;
	
	public RDAccount(double interestRate, double amount, int number_of_month, double monthly_amount,int age) {
		super(interestRate, amount);
		this.number_of_month = number_of_month;
		this.monthly_amount = monthly_amount;
		this.age=age;
	}

	public double calculateInterest() {
		double am=0.0;
			if(age<60) {
				if(number_of_month>=1 && number_of_month<=6) {
					am= (amount*7.50)/100;
				}
				if(number_of_month>=7 && number_of_month<=9) {
					am=  (amount*7.75)/100;
				}
				if(number_of_month>=10 && number_of_month<=12) {
					am=  (amount*8.00)/100;
				}
				if(number_of_month>=13 && number_of_month<=15) {
					am=  (amount*8.25)/100;
				}
				if(number_of_month>=16 && number_of_month<=18) {
					am=  (amount*8.50)/100;
				}
				if(number_of_month>=18 && number_of_month<=21) {
					am=  (amount*8.75)/100;
				}
			else {
				if(number_of_month>=1 && number_of_month<=6) {
					am=  (amount*8.00)/100;
				}
				if(number_of_month>=7 && number_of_month<=9) {
					am=  (amount*8.75)/100;
				}
				if(number_of_month>=10 && number_of_month<=12) {
					am=  (amount*8.50)/100;
				}
				if(number_of_month>=13 && number_of_month<=15) {
					am=  (amount*8.75)/100;
				}
				if(number_of_month>=16 && number_of_month<=18) {
					am=  (amount*9.00)/100;
				}
				if(number_of_month>=18 && number_of_month<=21) {
					am=  (amount*9.25)/100;
				}
			   }
		
		
	}
			return am;	
	
}
}

public class BankAssignment {
	public static void main(String str[]) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("1. Interest Calculator FD \n2. Interest Calculator RD \n3. Interest Calculator SB ");
	int x=sc.nextInt();
	
	switch(x) {
	case 1:  System.out.println("Enter FD amount");
		     double amount=sc.nextDouble();
		     System.out.println("Enter number of days");
		     int nod=sc.nextInt();
		     System.out.println("Enter Age of Acount Holder");
		     int age=sc.nextInt();
		     FDAccount f=new FDAccount(90.0,amount,nod,age);
		     System.out.println(f.calculateInterest());
		     break;
	case 2: System.out.println("Enter RD amount");
            double amount1=sc.nextDouble();
            System.out.println("Enter number of months");
            int nom=sc.nextInt();
            System.out.println("Enter age");
            int age1=sc.nextInt();
            
            Account r=new RDAccount(90.0,amount1,nom,10,age1);
            System.out.println(r.calculateInterest());
            break;
	case 3: System.out.println("Enter SB amount");
            double amount2=sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter type of Account (NRI/Normal)");
            String toc=sc.nextLine();
            SBAccount s=new SBAccount(90.0,amount2,toc);
            System.out.println(s.calculateInterest());
             break;
    default:System.out.println("Wrong Choice");
	}
	sc.close();
	
}
}
