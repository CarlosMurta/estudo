package com.example.simpleController.pojo.addressexample;

import java.util.List;

public class AddressHolder {

    private List<Address> addressList;
    private String owner;

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

}
