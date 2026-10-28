package model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Client> clients;
    private List<Order> orders;
    private List<Product> products;

    public Restaurant() {
        this.clients = new ArrayList<>();
        this.orders = new ArrayList<>();
        this.products = new ArrayList<>();
    }

    public boolean createOrder(String id, Client client) {
        return true;
    }

    public boolean addItem(Order orderId, int quantity, Product product) {
        return true;
    }

    public boolean calcularValorTotal(Order orderId, int quantity, int price) {
            return true;
    }

    public List<Client> getClients() { return clients; }
    public List<Order> getOrders() { return orders; }
    public List<Product> getProducts() { return products; }
    public void addProduct(Product product) { products.add(product); }
}