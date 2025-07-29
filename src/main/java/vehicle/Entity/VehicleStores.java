package vehicle.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class VehicleStores {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;

    private String ShowroomCity;
    private String owenrName;



    

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

    


    


}
