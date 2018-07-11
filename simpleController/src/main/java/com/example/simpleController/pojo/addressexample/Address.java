package com.example.simpleController.pojo.addressexample;

public class Address {

    private String street;
    private String country;

    public Address(String street, String country) {
        this.street = street;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
