package com.example.simpleController.controllers;

import com.example.simpleController.pojo.Person;
import com.example.simpleController.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController
{

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "persons", method = RequestMethod.GET) //GET, POST, PUT, DELETE //endpoint
    public ResponseEntity<Person> person() {
        //chama servi ....
        Person person = personService.createPerson();
        return new ResponseEntity<>(person, HttpStatus.OK);
    }

    @RequestMapping(value = "persons", method = RequestMethod.POST) //GET, POST, PUT, DELETE
    public ResponseEntity<Person> person(@RequestBody Person person){
        personService.insertPerson(person);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @RequestMapping(value = "persons/{id}", method = RequestMethod.GET) //GET, POST, PUT, DELETE
    public ResponseEntity<Person> person(@PathVariable Integer id){
        System.out.println("Get person: " + id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
