package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest {

    Restaurant restaurant = new Restaurant();
    @Test
    void createCorrectlyOrder(){
        Client client = new Client("Juan", "01"); //Arrange
        boolean flag = restaurant.createOrder("02", client); //Act
        assertTrue(flag); //Assert
    }
}

