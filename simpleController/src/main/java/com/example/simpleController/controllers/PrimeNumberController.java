package com.example.simpleController.controllers;

import com.example.simpleController.pojo.Person;
import com.example.simpleController.pojo.PrimeNumberResult;
import com.example.simpleController.services.PrimeNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeNumberController {

    @Autowired
    private PrimeNumberService primeNumberService;

    @RequestMapping(value = "prime/{start}/{end}", method = RequestMethod.GET)
    public ResponseEntity<PrimeNumberResult> person(@PathVariable Integer start, @PathVariable Integer end) {

        PrimeNumberResult primeNumberResult = primeNumberService.getPrimeNumbersBetween(start, end);

        return new ResponseEntity<>(primeNumberResult, HttpStatus.OK);

    }

}
