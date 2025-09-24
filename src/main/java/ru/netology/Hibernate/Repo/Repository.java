package ru.netology.Hibernate.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.netology.Hibernate.Person.Person;
import ru.netology.Hibernate.Person.PersonId;

import java.util.List;

//Берем методы из JpaRepository. Делаем заппрос к БД

public interface Repository extends JpaRepository<Person, PersonId> {
    List<Person> findByCityOfLiving(String city);
}
