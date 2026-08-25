package model;
import java.util.List;

public interface VehicleService {
    void addVehicle(Vehicle vehicle);
    boolean updateVehicle(String id, Vehicle newVehicle);
    boolean deleteVehicle(String id);
    List<Vehicle> searchByName(String name);
    void sortByPrice(boolean ascending);
    void displayAllVehicles();
}
