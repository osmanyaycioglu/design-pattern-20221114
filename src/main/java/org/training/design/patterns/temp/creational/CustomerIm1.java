package org.training.design.patterns.temp.creational;

import lombok.Setter;

import java.time.LocalDate;

public class CustomerIm1 {

    private String    name;
    private String    surname;
    private String    username;
    private String    password;
    private LocalDate birthdate;

    public CustomerIm1(String name,
                       String surname,
                       String username,
                       String password,
                       LocalDate birthdate) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.birthdate = birthdate;
    }

    public CustomerIm1(String name,
                       String surname,
                       String username,
                       String password) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public LocalDate getBirthdate() {
        return this.birthdate;
    }
}
