package com.quickClick.demo.Pojo;

public class Cart {
    private Integer order_history;
    private boolean isPlaced;
    private Integer Product_id;
    private Integer User_Id;
    private String timeOfOrder;

    public Cart(Integer order_history, boolean isPlaced, Integer product_id, Integer user_Id, String timeOfOrder) {
        this.order_history = order_history;
        this.isPlaced = isPlaced;
        Product_id = product_id;
        User_Id = user_Id;
        this.timeOfOrder = timeOfOrder;
    }

    public Cart() {
    }

    public Integer getOrder_history() {
        return order_history;
    }

    public void setOrder_history(Integer order_history) {
        this.order_history = order_history;
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
