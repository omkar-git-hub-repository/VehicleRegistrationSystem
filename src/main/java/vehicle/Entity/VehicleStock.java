package vehicle.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class VehicleStock {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int availableStock;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAvailableStock() {
        return availableStock;
    }

    public void setAvailableStock(int availableStock) {
        this.availableStock = availableStock;
    }

    @Override
    public String toString() {
        return "VehicleStock [id=" + id + ", availableStock=" + availableStock + "]";
    }
    

    



    
}
