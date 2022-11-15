package org.training.design.patterns.temp.creational;

public class RunTest {
    public static void main(String[] args) {
        CustomerIm1 customerIm1 = new CustomerIm1("osman",
                                                  "yaycıoğlu",
                                                  "osmanyay",
                                                  "123456");
        CustomerIm3 customerIm3 = CustomerIm3.builder()
                                             .withName("osman")
                                             .withSurname("yaycıoğlu")
                                             .build();

        CustomerMutable customerMutable = CustomerMutable.createCustomer()
                                                         .setName("osman")
                                                         .setUsername("osmanyay")
                                                         .setPassword("12234")
                                                         .setSurname("yaycı");
    }
}
