package com.example.simpleController.pojo;

import java.util.List;

public class PrimeNumberResult {

    private List<Integer> primeNumberList;
    private String message;

    public List<Integer> getPrimeNumberList() {
        return primeNumberList;
    }

    public void setPrimeNumberList(List<Integer> primeNumberList) {
        this.primeNumberList = primeNumberList;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
