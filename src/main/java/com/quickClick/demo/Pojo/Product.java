package com.quickClick.demo.Pojo;

import java.util.ArrayList;

public class Product {
    private Integer product_id;
    private String product_name;
    private String product_description;
    private Integer product_prize;
    private Integer product_weight;
    private String product_category;
    private Integer merchant_id;
    private Integer qunatity_available;
    private Integer rating;
    private String review;

    public Product(Integer product_id, String product_name, String product_description, Integer product_prize, Integer product_weight, String product_category, Integer merchant_id, Integer qunatity_available, Integer rating, String review) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_description = product_description;
        this.product_prize = product_prize;
        this.product_weight = product_weight;
        this.product_category = product_category;
        this.merchant_id = merchant_id;
        this.qunatity_available = qunatity_available;
        this.rating = rating;
        this.review = review;
    }

    public Product() {
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public Integer getProduct_prize() {
        return product_prize;
    }

    public void setProduct_prize(Integer product_prize) {
        this.product_prize = product_prize;
    }

    public Integer getProduct_weight() {
        return product_weight;
    }

    public void setProduct_weight(Integer product_weight) {
        this.product_weight = product_weight;
    }

    public String getProduct_category() {
        return product_category;
    }

    public void setProduct_category(String product_category) {
        this.product_category = product_category;
    }

    public Integer getMerchant_id() {
        return merchant_id;
    }

    public void setMerchant_id(Integer merchant_id) {
        this.merchant_id = merchant_id;
    }

    public Integer getQunatity_available() {
        return qunatity_available;
    }

    public void setQunatity_available(Integer qunatity_available) {
        this.qunatity_available = qunatity_available;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
