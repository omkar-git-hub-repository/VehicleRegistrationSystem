package com.vehicle;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import vehicle.Entity.Vehicles;
import vehicle.Utility.HibernateUtility;

public class Add_New_Vehicle {
	
	public void AddVehicles() {
		// 1.session Factory
		SessionFactory factory = HibernateUtility.getSessionFactory();

		// 2. session from session factory
		Session session = factory.openSession();

		// 3.Transaction from session
		Transaction transaction = session.beginTransaction();

		Vehicles s = new Vehicles();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Vehicle ID: ");

		s.setId(sc.nextInt());
		sc.nextLine();

		System.out.println("enter Owner name: ");
		s.setOwnerName(sc.nextLine());

		System.out.println("Enter vehicle Number: ");
		s.setVehicleNumber(sc.nextLine());

		System.out.println("Enter vehicle Model: ");
		s.setModel(sc.nextLine());

		System.out.println("Enter Registration Year: ");
		s.setRegistrationYear(sc.nextInt());

		// 4.save process
		session.persist(s);

		System.out.println("Updated Successfully " + s);
		// 5.pass to database
		transaction.commit();

	}

	

}
