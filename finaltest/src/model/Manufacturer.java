package model;

public class Manufacturer {
    private String id;
    private String name;
    private String address;
    private String email;

    public Manufacturer(String id, String name, String address, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public Manufacturer() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Mã nhà sản xuất: " + id + "\nTên nhà sản xuất: " + name +
                "\nĐịa chỉ nhà sản xuất: " + address + "\nEmail nhà sản xuất: " + email;
    }
}
