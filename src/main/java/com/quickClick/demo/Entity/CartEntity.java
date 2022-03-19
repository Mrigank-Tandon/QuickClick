package com.quickClick.demo.Entity;

//import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;


@Entity
@Table(name = "Cart")
public class CartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer cart_id;

    private Integer order_history;
    private boolean isPlaced;
    private Integer Product_id;
    private Integer User_Id;
    private String timeOfOrder;

    public CartEntity(Integer order_history, Integer cart_id, boolean isPlaced, Integer product_id, Integer user_Id, String timeOfOrder) {
        this.order_history = order_history;
        this.cart_id = cart_id;
        this.isPlaced = isPlaced;
        Product_id = product_id;
        User_Id = user_Id;
        this.timeOfOrder = timeOfOrder;
    }

    public CartEntity() {
    }

    public Integer getOrder_history() {
        return order_history;
    }

    public void setOrder_history(Integer order_history) {
        this.order_history = order_history;
    }

    public Integer getCart_id() {
        return cart_id;
    }

    public void setCart_id(Integer cart_id) {
        this.cart_id = cart_id;
    }

    public boolean isPlaced() {
        return isPlaced;
    }

    public void setPlaced(boolean placed) {
        isPlaced = placed;
    }

    public Integer getProduct_id() {
        return Product_id;
    }

    public void setProduct_id(Integer product_id) {
        Product_id = product_id;
    }

    public Integer getUser_Id() {
        return User_Id;
    }

    public void setUser_Id(Integer user_Id) {
        User_Id = user_Id;
    }

    public String getTimeOfOrder() {
        return timeOfOrder;
    }

    public void setTimeOfOrder(String timeOfOrder) {
        this.timeOfOrder = timeOfOrder;
    }
}
