/**
 * Created by Ben Maxwell on 2/7/17.
 */
public class Truck extends InventoryItem {

    String vehicleCategory;

    public Truck(String vehicleType, int quantity) {
        this.vehicleType = vehicleType;
        this.quantity = quantity;
        this.vehicleCategory = "Truck";
    }


}
