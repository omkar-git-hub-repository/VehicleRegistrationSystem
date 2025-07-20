package vehicle.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehicles")
public class Vehicles {

	@Id
	private int id;
	private String OwnerName;

	private String vehicleNumber;
	private String model;

	private int registrationYear;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOwnerName() {
		return OwnerName;
	}

	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getRegistrationYear() {
		return registrationYear;
	}

	public void setRegistrationYear(int registrationYear) {
		this.registrationYear = registrationYear;
	}

	@Override
	public String toString() {
		return "Vehicles [id=" + id + ", OwnerName=" + OwnerName + ", vehicleNumber=" + vehicleNumber + ", model="
				+ model + ", registrationYear=" + registrationYear + "]";
	}

}
