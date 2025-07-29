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
public class VehicleStores {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;

    private String ShowroomCity;
    private String owenrName;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Vehicle_Store_ID")
    private List<VehicleStoreCity> storeCityList;

    
    

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getShowroomCity() {
        return ShowroomCity;
    }
    public void setShowroomCity(String showroomCity) {
        ShowroomCity = showroomCity;
    }
    public String getOwenrName() {
        return owenrName;
    }
    public void setOwenrName(String owenrName) {
        this.owenrName = owenrName;
    }
    @Override
    public String toString() {
        return "VehicleStores [id=" + id + ", ShowroomCity=" + ShowroomCity + ", owenrName=" + owenrName + "]";
    }
    public List<VehicleStoreCity> getStoreCityList() {
        return storeCityList;
    }
    public void setStoreCityList(List<VehicleStoreCity> storeCityList) {
        this.storeCityList = storeCityList;
    }

    


    


}
