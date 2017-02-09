public class Main {

    public static void main(String[] args) throws Exception {

        VehicleInventory session = new VehicleInventory();
        session.loadInv();

        while (true) {
            session.promptAndProcess();
        }
    }
}
