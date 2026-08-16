package model;

import java.util.ArrayList;

public class Store {
    private ArrayList<Smartphone> inventory = new ArrayList();

    public Store() {
    }

    public void addPhoneToStore(Smartphone phone) {
        this.inventory.add(phone);
    }

    public Smartphone search(String id) {
        for(Smartphone sp : this.inventory) {
            if (sp.getId().equals(id)) {
                return sp;
            }
        }

        return null;
    }

    public ArrayList<Smartphone> search(double minPrice, double maxPrice) {
        ArrayList<Smartphone> result = new ArrayList();

        for(Smartphone sp : this.inventory) {
            if (sp.getPrice() >= minPrice && sp.getPrice() <= maxPrice) {
                result.add(sp);
            }
        }

        return result;
    }

    public ArrayList<Smartphone> search(String keyword, boolean isSearchByName) {
        ArrayList<Smartphone> result = new ArrayList();
        if (!isSearchByName) {
            return result;
        } else {
            String lowerKeyword = keyword.toLowerCase();

            for(Smartphone phone : this.inventory) {
                if (phone.getName().toLowerCase().contains(lowerKeyword)) {
                    result.add(phone);
                }
            }

            return result;
        }
    }

    public void sellPhone(Customer customer, String phoneId) {
        Smartphone sp = this.search(phoneId);
        if (sp == null) {
            System.out.println("Không tìm thấy sản phẩm " + phoneId + " trong kho!");
        } else if (sp.getStock() <= 0) {
            System.out.println("Sản phẩm " + phoneId + " đã hết hàng!");
        } else {
            sp.setStock(sp.getStock() - 1);
            customer.addPhone(sp);
        }
    }

    public double calculateInventoryValue() {
        double total = (double)0.0F;

        for(Smartphone sp : this.inventory) {
            total += sp.getFinalPrice() * (double)sp.getStock();
        }

        return total;
    }
}
