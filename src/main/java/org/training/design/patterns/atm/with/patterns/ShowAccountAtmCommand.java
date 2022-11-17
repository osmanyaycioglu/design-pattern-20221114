package org.training.design.patterns.atm.with.patterns;

import org.training.design.patterns.atm.Account;
import org.training.design.patterns.atm.Customer;
import org.training.design.patterns.atm.EAccountType;

import java.util.Scanner;

public class ShowAccountAtmCommand extends AbstractAtmCommand {

    public ShowAccountAtmCommand(EAccountType accountType) {
        super(accountType);
    }

    @Override
    public void execute(Customer customer,
                        Scanner scanner) {
        Account account = findAccount(customer,
                                      accountType);
        if (account != null) {
            System.out.println(account);
        } else {
            System.out.println(accountType + " accountunuz yok");
        }

    }

    @Override
    public String commandString() {
        return accountType + " görüntüle";
    }
}
