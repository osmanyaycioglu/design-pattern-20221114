package org.training.design.patterns.atm.with.patterns;

import org.training.design.patterns.atm.Account;
import org.training.design.patterns.atm.Customer;
import org.training.design.patterns.atm.EAccountType;

import java.util.Scanner;

public interface IAtmCommand {
    void execute(Customer customer,
                 Scanner scanner);

    String commandString();

    default Account findAccount(Customer customer,
                                EAccountType accountType) {
        return customer.getAccounts()
                       .stream()
                       .filter(a -> a.getAccountType() == accountType)
                       .findFirst()
                       .orElse(null);
    }
}
