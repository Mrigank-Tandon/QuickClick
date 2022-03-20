package com.quickClick.demo.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.quickClick.demo.Pojo.Product;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Merchant")
public class MerchantEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer Merchant_id;

    private String Merchant_name;
    private String Merchant_email;
    private Integer Merchant_contact;
    private Integer No_of_ListingProd;
    private String Seller_sinceWhatDate;
    private Integer ProductRating;// average of all the product rating
    private Integer ServiceRating;

    @JsonIgnore
    @OneToMany
    @JoinColumn(name = "Merchant_id")
    private List<ProductEntity> productEntityList;


//    private List<ProductEntity> productEntityList1;



    public MerchantEntity() {
    }

    public MerchantEntity(Integer merchant_id, String merchant_name, String merchant_email, Integer merchant_contact,
                          Integer no_of_ListingProd, String seller_sinceWhatDate, Integer productRating, Integer serviceRating,
                          List<ProductEntity> productEntityList) {
        Merchant_id = merchant_id;
        Merchant_name = merchant_name;
        Merchant_email = merchant_email;
        Merchant_contact = merchant_contact;
        No_of_ListingProd = no_of_ListingProd;
        Seller_sinceWhatDate = seller_sinceWhatDate;
        ProductRating = productRating;
        ServiceRating = serviceRating;
        this.productEntityList = productEntityList;
    }

    public Integer getMerchant_id() {
        return Merchant_id;
    }

    public void setMerchant_id(Integer merchant_id) {
        Merchant_id = merchant_id;
    }

    public String getMerchant_name() {
        return Merchant_name;
    }

    public void setMerchant_name(String merchant_name) {
        Merchant_name = merchant_name;
    }

    public String getMerchant_email() {
        return Merchant_email;
    }

    public void setMerchant_email(String merchant_email) {
        Merchant_email = merchant_email;
    }

    public Integer getMerchant_contact() {
        return Merchant_contact;
    }

    public void setMerchant_contact(Integer merchant_contact) {
        Merchant_contact = merchant_contact;
    }

    public Integer getNo_of_ListingProd() {
        return No_of_ListingProd;
    }

    public void setNo_of_ListingProd(Integer no_of_ListingProd) {
        No_of_ListingProd = no_of_ListingProd;
    }

    public String getSeller_sinceWhatDate() {
        return Seller_sinceWhatDate;
    }

    public void setSeller_sinceWhatDate(String seller_sinceWhatDate) {
        Seller_sinceWhatDate = seller_sinceWhatDate;
    }

    public Integer getProductRating() {
        return ProductRating;
    }

    public void setProductRating(Integer productRating) {
        ProductRating = productRating;
    }

    public Integer getServiceRating() {
        return ServiceRating;
    }

    public void setServiceRating(Integer serviceRating) {
        ServiceRating = serviceRating;
    }

    public List<ProductEntity> getProductEntityList() {
        return productEntityList;
    }

    public void setProductEntityList(List<ProductEntity> productEntityList) {
        this.productEntityList = productEntityList;
    }
}
