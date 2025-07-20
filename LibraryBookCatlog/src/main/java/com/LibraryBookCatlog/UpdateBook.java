package com.LibraryBookCatlog;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import library.Entity.SetBook;
import library.Utility.HibernateUtility;

public class UpdateBook {

	public void updateBook() {

		// 1. Session Factory
		SessionFactory factory = HibernateUtility.getSessionFactory();

		// 2. Session From Session Factory
		Session session = factory.openSession();

		// 3. Transaction from session
		Transaction transaction = session.beginTransaction();

		Scanner sc = new Scanner(System.in);
		SetBook s = new SetBook();
		
		System.out.println("Add Book Details  : ");
	
		
		System.out.println("Enter Book Title : ");
		s.setTitle(sc.nextLine());
		
		System.out.println("Enter Book Author : ");
		s.setAuthor(sc.nextLine());
		
		System.out.println("Enter Book ISBN : ");
		s.setIsbn(sc.nextLine());
		
		System.out.println("Enter Available Copies : ");
		s.setAvailableCopies(sc.nextInt());
		
		 //4. Save process
	    session.persist(s);
	    
	    //5. pass to database
	    transaction.commit();
	    
	    //6.close  session
	     session.close();
		
	}

}
