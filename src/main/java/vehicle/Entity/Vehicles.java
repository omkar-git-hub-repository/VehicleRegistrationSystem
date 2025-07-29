package vehicle.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehicles")
public class Vehicles {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String OwnerName;

	private String vehicleNumber;
	private String modelNo;

	private int registrationYear;

	// Create Obj Of VehicleOwner
	



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOwnerName() {
		return OwnerName;
	}

	public void setOwnerName(String owner) {
		OwnerName = owner;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public int getRegistrationYear() {
		return registrationYear;
	}

	public void setRegistrationYear(int registrationYear) {
		this.registrationYear = registrationYear;
	}

	@Override
	public String toString() {
		return "Vehicles [id=" + id + ", OwnerName=" + OwnerName + ", vehicleNumber=" + vehicleNumber + ", modelNo="
				+ modelNo + ", registrationYear=" + registrationYear + "]";
	}

}
