package Problems.CarRentalSystem.Inventory;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<InventoryInstance> Inventory;

    public Inventory() {
        Inventory = new ArrayList<>();
    }

    public List<InventoryInstance> getInventoryInstances() {
        return Inventory;
    }

    public void addInventoryInstance(InventoryInstance inventory) {
        Inventory.add(inventory);
    }
}
