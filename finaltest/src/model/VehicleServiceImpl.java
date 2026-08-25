package model;
import java.util.List;
import java.util.ArrayList;

public class VehicleServiceImpl implements VehicleService {
    private ArrayList<Vehicle> vehicles;

    public VehicleServiceImpl() {
        this.vehicles = new ArrayList<>();
    }

    public VehicleServiceImpl() {
    }

    public ArrayList<Vehicle> getVehicles() {
        return new ArrayList<>(vehicles);
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    @Override
    public boolean updateVehicle(String id, Vehicle newVehicle) {

    }

    @Override
    public boolean deleteVehicle(String id) {
        for (Vehicle v : vehicles) {
            if (v.getId().equals(id)) {
                vehicles.remove(v);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Vehicle> searchByName(String name) {
        for (Vehicle v : vehicles) {
            if (v.getName().equals(name)) {
                v.displayInfo();
            }
            else {
                System.out.println("Phương tiện không tồn tại!");
                return;
            }
        }
    }

    @Override
    public void sortByPrice(boolean ascending) {
        if (ascending) {
            for (int i = 0; i < vehicles.size() - 1; i++) {
                for (int j = i + 1; j < vehicles.size(); j++) {
                    if ()
                }
            }
        }
    }

    @Override
    public void displayAllVehicles() {
        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }
}
