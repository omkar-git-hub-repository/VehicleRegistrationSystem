package com.vehicle;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    	public static void main(String[] args) {
    		System.out.println("Vehicle Registration System! ");

    		System.out.println("Choose an option:" + "\n1. Add New Vehicles" + "\n2.Search by Model "
    				+ "\n3. Delete Vehicle By ID" + "\n4. Update VehicleNo" + "\n5. Exit");
    		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter your Choice");

    		int choice = sc.nextInt();
    		sc.nextLine();

    		switch (choice) {

    		case 1:
    			Add_New_Vehicle ae = new Add_New_Vehicle();
    			ae.AddVehicles();
    			break;
    		case 2:
    			SearchByModel an = new SearchByModel();
    			an.SearchName();
    			break;
    		case 3:
    			DeleteByID de = new DeleteByID();
    			de.DeleteDetails();
    			break;
    		case 4:
    			UpdateVehicleNo ue = new UpdateVehicleNo();
    			ue.UpdateDetails();
    			break;
    		case 5:
    			System.out.println("Exiting program. Goodbye!");
    			System.exit(0); // Terminates the program immediately
    			break;
    		}

    	}
    }
}
