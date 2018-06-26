package com.example.simpleController.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HtmlInterpreterService {

    public String readHtml(){

        String url = "https://www.google.com";
        RestTemplate restTemplate = new RestTemplate();

        return null;
    }

}
