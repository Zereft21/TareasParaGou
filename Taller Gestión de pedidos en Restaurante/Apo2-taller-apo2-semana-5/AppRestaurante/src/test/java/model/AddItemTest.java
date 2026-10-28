package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddItemTest {

    Client client = new Client("paco", "01");
    Order order = new Order("02",client);

    @Test
    void additem() {
        Item item = new Item("3", "tomate"); //Arrange
        boolean flag = order.addItem(item); //Act
        assertTrue(flag); //Assert
    }
}