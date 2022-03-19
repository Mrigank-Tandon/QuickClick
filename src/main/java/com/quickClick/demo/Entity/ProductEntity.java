package com.quickClick.demo.Entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Product")
public class ProductEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer productId;

    private String productName;
    private String productDescription;
    private Integer productPrice;
    private Integer productWeight;
    private String productCategory;
    private Integer merchantId;
    private Integer qunatityAvailable;
    private Integer rating;
    private String review;
    private String imageSource;

    public String getImageSource() {
        return imageSource;
    }

    public void setImageSource(String imageSource) {
        this.imageSource = imageSource;
    }

    public ProductEntity(Integer productId, String productName, String productDescription, Integer productPrice, Integer productWeight, String productCategory, Integer merchantId, Integer qunatityAvailable, Integer rating, String review, String imageSource) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.productWeight = productWeight;
        this.productCategory = productCategory;
        this.merchantId = merchantId;
        this.qunatityAvailable = qunatityAvailable;
        this.rating = rating;
        this.review = review;
        this.imageSource = imageSource;
    }



    public ProductEntity() {
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(Integer productWeight) {
        this.productWeight = productWeight;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public Integer getQunatityAvailable() {
        return qunatityAvailable;
    }

    public void setQunatityAvailable(Integer qunatityAvailable) {
        this.qunatityAvailable = qunatityAvailable;
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
