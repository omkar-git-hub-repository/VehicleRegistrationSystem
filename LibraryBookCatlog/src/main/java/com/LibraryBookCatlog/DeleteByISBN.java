package com.LibraryBookCatlog;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import library.Entity.SetBook;
import library.Utility.HibernateUtility;

public class DeleteByISBN {

	public void deleteByISBN() {

		// 1. Session Factory
		SessionFactory factory = HibernateUtility.getSessionFactory();

		// 2. Session From Session Factory
		Session session = factory.openSession();

		// 3. Transaction from session
		Transaction transaction = session.beginTransaction();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book ISBN id to Delete : ");
		int BookISBN = sc.nextInt();

		SetBook s = session.find(SetBook.class, BookISBN);
		session.remove(s);

		transaction.commit();
		session.close();
	}

}
