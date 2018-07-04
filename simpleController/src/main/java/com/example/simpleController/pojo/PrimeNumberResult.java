package com.example.simpleController.pojo;

import java.util.List;

public class PrimeNumberResult {

    private String message;
    private List<Integer> primeNumberList;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Integer> getPrimeNumberList() {
        return primeNumberList;
    }

    public void setPrimeNumberList(List<Integer> primeNumberList) {
        this.primeNumberList = primeNumberList;
    }

}
