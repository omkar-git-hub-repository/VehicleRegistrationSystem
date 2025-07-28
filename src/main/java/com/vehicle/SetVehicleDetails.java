package com.vehicle;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import vehicle.Entity.VehicleOwner;
import vehicle.Entity.Vehicles;
import vehicle.Utility.HibernateUtility;

public class SetVehicleDetails {

    public void setVehicleDetails() {

        SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();


        Vehicles v = new Vehicles();

        v.setOwnerName("John Doe");
        v.setVehicleNumber("ABC123");
        v.setModelNo("Model X");
        v.setRegistrationYear(2023);
        

        VehicleOwner owner = new VehicleOwner();
        owner.setOwnerName("John Doe");
        owner.setCity("New York");
        owner.setAge("30");

        owner.setVehicles(v);
        v.setVehicleOwner(owner);

       // session.persist(owner);
        session.persist(v);
        transaction.commit();
        session.close();
    }

}
