package com.example.simpleController.controllers;

import com.example.simpleController.pojo.Person;
import com.example.simpleController.pojo.addressexample.Address;
import com.example.simpleController.pojo.addressexample.AddressHolder;
import com.example.simpleController.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "persons", method = RequestMethod.GET)
    public ResponseEntity<Person> person() {
        Person person = personService.createPerson();
        return new ResponseEntity<>(person, HttpStatus.OK);
    }

    @RequestMapping(value = "persons", method = RequestMethod.POST)
    public ResponseEntity<Person> person(@RequestBody Person person){
        personService.insertPerson(person);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @RequestMapping(value = "persons/{id}", method = RequestMethod.GET)
    public ResponseEntity<Person> person(@PathVariable Integer id){
        System.out.println("Get person: " + id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "persons/address", method = RequestMethod.GET)
    public ResponseEntity<AddressHolder> GetAddress(){

        Address address1 = new Address("rua_0", "Brazil");
        Address address2 = new Address("rua_1", "Alemanha");
        Address address3 = new Address("rua_2", "Italia");

        List<Address> addressList = new ArrayList<>();

        addressList.add(address1);
        addressList.add(address2);
        addressList.add(address3);

        AddressHolder addressHolder = new AddressHolder();

        addressHolder.setAddressList(addressList);
        addressHolder.setOwner("Carlos");

        return new ResponseEntity<>(addressHolder, HttpStatus.OK);
    }

}
