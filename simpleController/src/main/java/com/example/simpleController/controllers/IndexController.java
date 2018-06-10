package com.example.simpleController.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Value("${looqbox.name}")
    private String name;

    @RequestMapping(value = {"index", "/"}, method = RequestMethod.GET) //GET, POST, PUT, DELETE
    public ResponseEntity<String> person(){
        String text = "Welcome to " + name;
        return new ResponseEntity<>(text, HttpStatus.OK);
    }

}
