package com.vehicle;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import vehicle.Entity.Vehicles;
import vehicle.Utility.HibernateUtility;

public class DeleteByID {
	
	public void DeleteDetails() {
		SessionFactory factory = HibernateUtility.getSessionFactory();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Vehicle ID to delete : ");
		int Id = sc.nextInt();
		

		Vehicles st = session.find(Vehicles.class, Id);
		session.remove(st);

		transaction.commit();
		session.close();

	}

}
