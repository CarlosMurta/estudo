package com.example.simpleController.services;

import com.example.simpleController.pojo.Person;
import org.springframework.stereotype.Service;

@Service //Singleton
public class PersonService {

    public Person createPerson(){
        Person person = new Person();
        person.setAge(27);
        person.setName("Daniel");
        return person;
    }

    public void insertPerson(Person person) {
        System.out.println(person);
    }
}
