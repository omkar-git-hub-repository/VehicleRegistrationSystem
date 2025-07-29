package com.vehicle;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import vehicle.Entity.VehicleStoreCity;
import vehicle.Entity.VehicleStores;
import vehicle.Utility.HibernateUtility;

public class SetStoresData {

    public void setStoreData(){

        SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        


        VehicleStores vs = new VehicleStores();
        vs.setOwenrName("alice smith");
        vs.setShowroomCity("Pune");
        
        VehicleStoreCity vsc = new VehicleStoreCity();
        vsc.setCity("Kharadi");

         VehicleStoreCity vsc1 = new VehicleStoreCity();
        vsc.setCity("Wagholi");

         VehicleStoreCity vsc2 = new VehicleStoreCity();
        vsc.setCity("Hadapsar");

         VehicleStoreCity vsc3 = new VehicleStoreCity();
        vsc.setCity("Karve Nagr");

         VehicleStoreCity vsc4 = new VehicleStoreCity();
        vsc.setCity("PCMC");

        List<VehicleStoreCity> StoreList = Arrays.asList(vsc, vsc1, vsc2, vsc3,vsc4);

        vs.setStoreCityList(StoreList);

        session.persist(vs);

        transaction.commit();
        session.close();

        
 




    }
    
}
