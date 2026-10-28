package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private String id;
    private LocalDate orderDate;
    private String orderStatus;
    private double subTotal;
    private Client client;
    private List<Item> items;

    public Order(String id, Client client) {
        this.id = id;
        this.client = client;
        this.orderDate = LocalDate.now();
        this.orderStatus = Status.CREATED.name();
        this.subTotal = 0.0;
        this.items = new ArrayList<>();
    }



    public List<Item> getItems() { return items; }
    public boolean addItem(Item item) {
        return true;
    }
    public String getId() { return id; }
    public String getOrderStatus() { return orderStatus; }
    public void setOrderStatus(String orderStatus) { this.orderStatus = orderStatus; }
    public Client getClient() { return client; }
}
