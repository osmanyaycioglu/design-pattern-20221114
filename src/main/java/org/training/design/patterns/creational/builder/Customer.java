package org.training.design.patterns.creational.builder;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

public class Customer {

    private final String    name;
    private final String    surname;
    private final String    username;
    private final String    password;
    private final LocalDate birthdate;

    private Customer(String name,
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

    public static CustomerBuilder getBuilder(){
        return new CustomerBuilder();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public static class CustomerBuilder {
        private String    name;
        private String    surname;
        private String    username;
        private String    password;
        private LocalDate birthdate;

        private CustomerBuilder() {
        }

        public CustomerBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CustomerBuilder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public CustomerBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public CustomerBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public CustomerBuilder setBirthdate(LocalDate birthdate) {
            this.birthdate = birthdate;
            return this;
        }

        public Customer build(){
            return new Customer(name,surname,username,password,birthdate);
        }
    }
}
