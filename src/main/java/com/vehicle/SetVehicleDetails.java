package com.vehicle;


import java.util.Arrays;
import java.util.List;

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

        Vehicles v2 = new Vehicles();
        v2.setOwnerName("Jane Smith");
        v2.setVehicleNumber("XYZ456");
        v2.setModelNo("Model Y");

        Vehicles v3 = new Vehicles();
        v3.setOwnerName("Alice Johnson");
        v3.setVehicleNumber("LMN789");
        v3.setModelNo("Model Z");

        Vehicles v4 = new Vehicles();
        v4.setOwnerName("Bob Brown");
        v4.setVehicleNumber("PQR012");
        v4.setModelNo("Model A");
        

        VehicleOwner owner = new VehicleOwner();
        owner.setOwnerName("John Doe");
        owner.setCity("New York");
        owner.setAge("30");

       List<Vehicles> vList = Arrays.asList(v, v2, v3, v4);
        owner.setVehicles(vList);

        // Persisting the VehicleOwner object will also persist the associated Vehicles
        session.persist(owner);
        
        // Alternatively, if you want to persist Vehicles separately:

        transaction.commit();
        session.close();
    }

}
