package ru.netology.Hibernate.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.Hibernate.Person.Person;
import ru.netology.Hibernate.Repo.Repository;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private Repository repository;

    @GetMapping("/persons/by-city")
    public List<Person> getPersonByCity(@RequestParam String city) {
        List<Person> result = repository.findByCityOfLiving(city);
        System.out.println("Найдено записей: " + result.size());
        return result;

    }
}
