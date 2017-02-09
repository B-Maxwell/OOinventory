/**
 * Created by MacbookStudioPro on 2/8/17.
 */
public class InventoryItem {

    String vehicleType;
    int quantity;
    String vehicleCategory;

    public InventoryItem() {}

    public InventoryItem(String vehicleType, int quantity, String vehicleCategory) {
        this.vehicleType = vehicleType;
        this.quantity = quantity;
        this.vehicleCategory = vehicleCategory;
    }
}
