package com.quickClick.demo.Entity;


import javax.persistence.*;

@Entity
@Table(name = "UserDetails")
public class UserDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer user_id;


    private String user_name;
    private Integer user_contact;
    private String user_email;

    public UserDetailsEntity(Integer user_id, String user_name, Integer user_contact, String user_email) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_contact = user_contact;
        this.user_email = user_email;
    }

    public UserDetailsEntity() {
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Integer getUser_contact() {
        return user_contact;
    }

    public void setUser_contact(Integer user_contact) {
        this.user_contact = user_contact;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }
}
