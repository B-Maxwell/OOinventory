/**
 * Created by Ben Maxwell on 2/7/17.
 */
public class Car extends InventoryItem {

    String vehicleCategory;

    public Car(String vehicleType, int quantity) {
        this.vehicleType = vehicleType;
        this.quantity = quantity;
        this.vehicleCategory = "Car";
    }



}
