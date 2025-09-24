package ru.netology.Hibernate.Person;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "persons", schema = "public")
@IdClass(PersonId.class)
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
    @Column(name = "name", nullable = false)
    private String name;

    @Id
    @Column(name = "surname", nullable = false)
    private String surname;

    @Id
    @Column(name = "age", nullable = false)
    private int age;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "city_of_living")
    private String cityOfLiving;
}


