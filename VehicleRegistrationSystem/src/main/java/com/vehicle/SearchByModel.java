package com.vehicle;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import vehicle.Entity.Vehicles;
import vehicle.Utility.HibernateUtility;

public class SearchByModel {
	
	public void SearchName() {
		// 1/session factory
		SessionFactory factory = HibernateUtility.getSessionFactory();

		// 2. session from session factory
		Session session = factory.openSession();

		// 3. Transaction from session
		Transaction transaction = session.beginTransaction();

		// 4.write your logic here
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Vehicle ID to Search : ");
		int Id = sc.nextInt();
		
		Vehicles vehicle = session.find(Vehicles.class, Id);
		System.out.println(vehicle.toString());

		// 5.pass to database
		transaction.commit();

		// 6.session close
		session.close();

	}

}
