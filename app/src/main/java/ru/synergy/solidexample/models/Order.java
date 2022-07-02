package ru.synergy.solidexample.models;

public class Order {

    String customerName = "Artem";
    String customerEmail = "artem@gmail.com";
    private String id;

    public boolean isValid() {
        return false;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public Item[] getItems() {
        return new Item[0];
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
