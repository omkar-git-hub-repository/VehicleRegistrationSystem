package vehicle.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;

@Entity
public class VehicleOwner {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String ownerName;
    private String city;
    private String age;

    @OneToMany(cascade =  CascadeType.ALL)
    @JoinTable(name = "owner_vehicle")
    private List<Vehicles> vehicles;

    // getter setter
    public List<Vehicles> getVehicles() {
        return vehicles;
    }
    public void setVehicles(List<Vehicles> vehicles) {
        this.vehicles = vehicles;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

  

    @Override
    public String toString() {
        return "VehicleOwner [id=" + id + ", ownerName=" + ownerName + ", city=" + city + ", age=" + age + "]";
    }

    
    




}
