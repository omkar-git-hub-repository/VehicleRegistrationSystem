package com.LibraryBookCatlog;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import library.Utility.HibernateUtility;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        
     //   AddBook a = new AddBook();
      //  a.addBook();
        
        
      //  SearchByAuthor sa = new SearchByAuthor();
      //  sa.FindByAuthor();
        
        UpdateBook u = new UpdateBook();
        u.updateBook();
        
       //session.persist(transaction); 
       transaction.commit();
       session.close();
        
    }
}
