package com.capg.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.capg.bean.Customer;
import com.capg.service.PaymentWalletService;
import com.capg.service.PaymentWalletServiceImpl;

class WalletTest {

    static PaymentWalletService ps;
    @BeforeAll
	public static void init() {
    	ps=new PaymentWalletServiceImpl();
    }
    @Test
	void test() throws Exception {
		assertEquals("Account Created Vishal", ps.createAccount(new Customer("Vishal", "Singh",22, 3432123456765432L, 9023109856L,
				"vishal12@gmail.com", "MZP", "UP", 231313,1000 ))); //Passed
    }
    @Test
   	void test1()throws Exception {
   		
   		assertEquals("Balance: 1000", ps.showBalance(1234543212345678L)); //This will fail since account number is randomly generated
   	}
    @Test
   	void test2()throws Exception {
   		
   		assertEquals("1000 deposited", ps.deposit(1232123456789876L, 1000));//This will fail since account number is randomly generated
   	}
    @Test
   	void test3() throws Exception {
   		
   		assertEquals("1000 Withdrawn", ps.withdraw(1234565432123456L, 1000));//This will fail since account number is randomly generated
   	}
    
    @AfterAll
   	public static void destroy() {
       	ps=null;
       }

}
