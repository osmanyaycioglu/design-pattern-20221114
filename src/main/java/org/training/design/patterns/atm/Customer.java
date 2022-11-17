package org.training.design.patterns.atm;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder(setterPrefix = "with")
public class Customer {
    private String name;
    private String surname;
    private String username;
    private String password;
    private List<Account> accounts;
    private ECustomerType customerType;




}
