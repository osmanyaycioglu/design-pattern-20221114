package org.training.design.patterns.temp.creational;

import java.time.LocalDate;

public class CustomerIm2 {

    private final String    name;
    private final String    surname;
    private final String    username;
    private final String    password;
    private LocalDate birthdate;

    public CustomerIm2(String name,
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

    public CustomerIm2(String name,
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
