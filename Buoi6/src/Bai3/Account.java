package Bai3;

public class Account {
    protected String username;
    protected String email;
    protected Address address;

    public Account(String username, String email, Address address) {
        this.username = username;
        this.email = email;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    public double getDiscount() {
        return 0;
    }

    public void showInfo() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
    }
}
