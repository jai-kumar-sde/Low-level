package Problems.CarRentalSystem.Inventory;

import Problems.CarRentalSystem.Interval;
import Problems.CarRentalSystem.VehicleInstance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventoryInstance {
    private static int counter =0;
    private int inventoryId;
    //private String location;
    private List<VehicleInstance> vehiclesInstances;


    public InventoryInstance(List<VehicleInstance> vehiclesInstances) {
        this.inventoryId = ++counter;
        this.vehiclesInstances = vehiclesInstances;
    }

    public int getId() {
        return inventoryId;
    }

    public void setId(int id) {
        this.inventoryId = id;
    }

    public List<VehicleInstance> getVehiclesInstances() {
        return vehiclesInstances;
    }

    public void addVehiclesInstances(VehicleInstance vehiclesInstance) {
        this.vehiclesInstances.add(vehiclesInstance);
    }


}
