package org.training.design.patterns.temp.puzzle1;

import org.training.design.patterns.structural.adapter.PersonToEmployeeAdapter;
import org.training.design.patterns.structural.adapter.PrinterAdapter;
import org.training.design.patterns.structural.facade.IPrinterFacade;
import org.training.design.patterns.structural.facade.PrinterFacadeFactory;

public class PrinterRun2 {
    public static void main(String[] args) {
        Employee employee = Employee.builder()
                                    .withName("osman")
                                    .withSurname("yaycıoğlu")
                                    .withGender(EGender.MALE)
                                    .build();
        Printer printer = new Printer(); // bu satırı değiştir
        printer.print(employee);
        printer.print(employee);
        printer.print(employee);


    }
}
