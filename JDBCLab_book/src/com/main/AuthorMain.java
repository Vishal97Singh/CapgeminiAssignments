package com.main;

import java.util.List;
/**
 * @author Vishal Singh
 */
import java.util.Scanner;

import com.bean.Author;
import com.service.AuthorService;
import com.service.AuthorServiceImpl;

public class AuthorMain {
	public static void main(String args[]) {
		AuthorService as=new AuthorServiceImpl();
		int authorId;
		String firstName,middleName,lastName,mobileNo;
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("1. All Employee \n2. Insert \n3. Update \n4. Delete  \n5. Exit ");
		System.out.println("Enter choice");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1: List<Author> li=as.allAuthor();
		        li.forEach((author)->{
		        	System.out.println(author.getAuthorId()+"\t"+author.getFirstName()+"\t"+author.getLastName()+"\t"+author.getLastName()+"\t"+author.getPhoneNo());
		        });
		
		        break;
		        
		case 2: System.out.println("Enter authorId");
		        authorId=sc.nextInt();
		        System.out.println("Enter FirstName");
		        firstName=sc.next();
		        System.out.println("Enter MiddleName");
		        middleName=sc.next();
		        System.out.println("Enter lastName");
		        lastName=sc.next();
		        System.out.println("Enter MobileNo");
		        mobileNo=sc.next();
		        Author author=new Author(authorId,firstName,middleName,lastName,mobileNo);
		        System.out.println(as.insertAuthor(author));
		        break;
		        
		case 3: System.out.println("Enter authorId");
		        authorId=sc.nextInt();
		        System.out.println("Enter FirstName");
		        firstName=sc.next();
		        System.out.println(as.updateAuthor(authorId, firstName));
		        break;
		        
		case 4: System.out.println("Enter authorId");
		        authorId=sc.nextInt();
		        System.out.println(as.deleteAuthor(authorId));
		        break;
		case 5: return;
		
		default: System.out.println("Enter valid Choice");
		        
		}
		}
		
	}

}
