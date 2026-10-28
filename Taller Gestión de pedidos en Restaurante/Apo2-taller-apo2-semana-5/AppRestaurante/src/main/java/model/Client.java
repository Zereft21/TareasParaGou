package model;

public class Client {
    private String name;
    private String id;
    private boolean discount;

    public Client(String name, String id) {
        this.name = name;
        this.id = id;
        this.discount = false;
    }

    public String getName() { return name; }
    public String getId() { return id; }
    public boolean hasDiscount() { return discount; }
    public void setDiscount(boolean discount) { this.discount = discount; }
}