package com.vehicle;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import vehicle.Entity.Vehicles;
import vehicle.Utility.HibernateUtility;

public class UpdateVehicleNo {

	public void UpdateDetails() {

		SessionFactory factory = HibernateUtility.getSessionFactory();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter vehicle Number");
		String vehicleNo = sc.nextLine();
		sc.nextLine();

		Vehicles s1 = session.find(Vehicles.class, vehicleNo);

		System.out.println("Enter Updated Salary");
		String vehicleno = sc.nextLine();
		s1.setVehicleNumber(vehicleno);

		transaction.commit();

		session.close();
	}
}
