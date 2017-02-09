/**
 * Created by Ben Maxwell on 2/7/17.
 */
public class Van extends InventoryItem {


    String vehicleCategory;

    public Van(String vehicleType, int quantity) {
        this.vehicleType = vehicleType;
        this.quantity = quantity;
        this.vehicleCategory = "Van";
    }
}
