package org.training.design.patterns.atm.with.patterns;

import org.training.design.patterns.atm.Customer;
import org.training.design.patterns.atm.EAccountType;
import org.training.design.patterns.atm.with.patterns.customer.CustomerFacade;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class Atm {
    private CustomerFacade customerFacade = new CustomerFacade();

    public void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("username:");
            String username = scanner.nextLine();
            System.out.println("password:");
            String password = scanner.nextLine();
            Customer customer = customerFacade.login(username,
                                 password);

            if (customer != null) {
                root:
                while (true) {
                    List<IAtmCommand> customerAtmCommands = AtmCommandFactory.getCustomerAtmCommands(customer);
                    int index = 1;
                    for (IAtmCommand  atmCommand:
                         customerAtmCommands) {
                        System.out.println(index + "-" + atmCommand.commandString());
                        index++;
                    }
                    System.out.println("seçiminiz : ");
                    int menuIndex = scanner.nextInt();
                    if (menuIndex > customerAtmCommands.size()){
                        break root;
                    }
                    IAtmCommand atmCommand = customerAtmCommands.get(menuIndex - 1);
                    atmCommand.execute(customer,scanner);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
