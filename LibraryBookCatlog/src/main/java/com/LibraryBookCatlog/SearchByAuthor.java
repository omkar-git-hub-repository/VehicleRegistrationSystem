package com.LibraryBookCatlog;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import library.Entity.SetBook;
import library.Utility.HibernateUtility;

public class SearchByAuthor {

	public void FindByAuthor() {

		// 1. Session Factory
		SessionFactory factory = HibernateUtility.getSessionFactory();

		// 2. Session From Session Factory
		Session session = factory.openSession();

		// 3. Transaction from session
		Transaction transaction = session.beginTransaction();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Book Author Name  : ");
		String FindAuthorName = sc.nextLine();

		// HQL query to get books by author name
		String hql = "FROM SetBook b WHERE b.author = :authorName";
		Query<SetBook> query = session.createQuery(hql, SetBook.class);
		query.setParameter("authorName", FindAuthorName);

		List<SetBook> books = query.list();

		if (books.isEmpty()) {
			System.out.println("No books found for author: " + FindAuthorName);
		} else {
			for (SetBook b : books) {
				System.out.println(b.toString());
			}
		}

		// 5. pass to database
		transaction.commit();

		// 6.close session
		session.close();

	}
}
