package org.training.design.patterns.creational.builder;

import java.time.LocalDate;

public class CustomerRun {
    public static void main(String[] args) {
        Customer c = Customer.getBuilder()
                             .setName("osman")
                             .setSurname("yaycıoğlu")
                             .setUsername("osmanyay")
                             .setPassword("123456")
                             .setBirthdate(LocalDate.now())
                             .build();

    }
}
