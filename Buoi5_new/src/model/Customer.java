package model;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<Smartphone> cart = new ArrayList();

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void addPhone(Smartphone phone) {
        this.cart.add(phone);
    }

    public void setCart(ArrayList<Smartphone> cart) {
        this.cart = cart;
    }

    public void removePhone(String id) {
        for(int i = 0; i < this.cart.size(); ++i) {
            if (((Smartphone)this.cart.get(i)).getId().equals(id)) {
                this.cart.remove(i);
                return;
            }
        }

    }

    public void removePhone(int index) {
        if (index >= 0 && index < this.cart.size()) {
            this.cart.remove(index);
        } else {
            System.out.println("Index không hợp lệ!");
        }

    }

    public ArrayList<Smartphone> getCart() {
        return new ArrayList(this.cart);
    }

    public double calculateTotalBill() {
        double totalBill = (double)0.0F;

        for(Smartphone sp : this.cart) {
            totalBill += sp.getFinalPrice();
        }

        return totalBill;
    }

    public String toString() {
        String var10000 = this.customerName;
        return "Khách hàng: " + var10000 + " - Số sản phẩm trong giỏ: " + this.cart.size();
    }
}
