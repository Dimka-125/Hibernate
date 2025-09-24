package ru.netology.Hibernate.Person;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

//Добавляем инфу про составной ключ

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class PersonId implements Serializable {
    private String name;
    private String surname;
    private int age;

}
