package model;

public class Item {
    private int quantity;
    private Product product;

    public Item(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;

    }

    public Item(String quantity, String product) {
    }





    public int getQuantity() { return quantity; }
    public Product getProduct() { return product; }
}