/**
 * Created by Ben Maxwelll on 2/7/17.
 */
public class Motorcycle extends InventoryItem {

    String vehicleCategory;

    public Motorcycle(String vehicleType, int quantity) {
        this.vehicleType = vehicleType;
        this.quantity = quantity;
        this.vehicleCategory = "Motorcycle";
    }


}
